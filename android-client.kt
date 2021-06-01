package client.android.com;

fun main() {
  println("Welcome to Fit with Kotlin!")
  createFitClient()
}

fun createFitClient() {
  // 1. Create a FitnessOptions instance
  // [START client_options]
  val fitnessOptions = FitnessOptions.builder()
    .addDataType(DataType.TYPE_STEP_COUNT_DELTA, FitnessOptions.ACCESS_READ)
    .addDataType(DataType.AGGREGATE_STEP_COUNT_DELTA, FitnessOptions.ACCESS_READ)
    .build()
  // [END client_options]

  // 2. Get an instance of the Account object to use with the API
  // [START account_object]
  val account = GoogleSignIn.getAccountForExtension(this, fitnessOptions)
  // [END account_object]

  // 3. Check if the user has previously granted the necessary data access
  // [START check_data_access]
  if (!GoogleSignIn.hasPermissions(account, fitnessOptions)) {
    GoogleSignIn.requestPermissions(
      this,
      GOOGLE_FIT_PERMISSIONS_REQUEST_CODE,
      account,
      fitnessOptions)
  } else {
    accessGoogleFit()
  }
  // [END check_data_access]
}

// 4. Handle the user's response, if authorization flow is required
// [START auth_flow]
override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
  super.onActivityResult(requestCode, resultCode, data)
  when (resultCode) {
    Activity.RESULT_OK -> when (requestCode) {
      GOOGLE_FIT_PERMISSIONS_REQUEST_CODE -> accessGoogleFit()
      else -> { /* Result wasn't from Google Fit */ }
    }
    else -> { /* Permission not granted */ }
  }
}
// [END auth_flow]

// 5. Create a fitness client, after the user has authorized access to the data
// [START create_client]
private fun accessGoogleFit() {
  val end = LocalDateTime.now()
  val start = end.minusYears(1)
  val endSeconds = end.atZone(ZoneId.systemDefault()).toEpochSecond()
  val startSeconds = start.atZone(ZoneId.systemDefault()).toEpochSecond()

  val readRequest = DataReadRequest.Builder()
    .aggregate(DataType.AGGREGATE_STEP_COUNT_DELTA)
    .setTimeRange(startSeconds, endSeconds, TimeUnit.SECONDS)
    .bucketByTime(1, TimeUnit.DAYS)
    .build()
  val account = GoogleSignIn.getAccountForExtension(this, fitnessOptions)
  Fitness.getHistoryClient(this, account)
    .readData(readRequest)
    .addOnSuccessListener({ response ->
        // Use response data here
        Log.i(TAG, "OnSuccess()")
    })
    .addOnFailureListener({ e -> Log.d(TAG, "OnFailure()", e) })
}
// [END create_client]
