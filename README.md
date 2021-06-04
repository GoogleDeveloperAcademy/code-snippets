# Code samples for DevRel

## Exercise: 
### 🤖 Task: 
Include code from this repository in the Google Developer Academy documentation site.

### 🤹‍♂️ Description: 
In this exercise you will each pull code from this repository using the **includecode** template tag to include snippets in our documentation site. This repository has a sample code file [`android_client.kt`](/android_client.kt) which has an example for _[Creating a Fitness API client](https://developers.google.com/fit/android/api-client-example)_ in Kotlin using the Android Fit SDK. You also have an `exercise2` folder under your devsite GDA workspace in google3 which has the iX _(information eXperience)_ document for this code sample. 

```sh
# Path to the exercise2 folder
google3_root> third_party/devsite/internal/en/experimental/gda/<USERNAME>

# Structure
exercise2
  |-- adding-snippets.md      # file you must work on
  |-- adding-snippets-sol.md  # solution file to validate your work
```

### 🧞‍♂️ Solution:

- The solution for the iX documentation changes is available in the file `adding-snippets-sol.md` under the `exercise2` directory in google3
- The solution for the source code changes is available in this repository under the git branch `answers`

---

### 😎 _Your mision should you choose to accept it_:

Using the **includecode** template tag in the iX document and **region tags** in the source code file, embed the code snippets pulled from this repository in the documentation.

---

### Step 1:
Check if this repository has been set up to be mirrored into `Gerrit (Git-on-Borg)`
- Go to: https://github.git.corp.google.com/
- Paste `GoogleDeveloperAcademy` in the repository to find for field
- Press `FIND` and check if the `code-snippets` repository has been mirrored

### Step 2:
Clone this repository locally and create new branch to work on. After completing this step, you should be able to see a branch after your \<USERNAME\> in this repository.
```sh
git clone https://github.com/GoogleDeveloperAcademy/code-snippets
cd code-snippets
git checkout -b <USERNAME>
git push --set-upstream origin sbm
```
![image](https://user-images.githubusercontent.com/7249208/120732573-900ea100-c4b3-11eb-9237-4e93cbfaba6f.png)


#### Step 2:
Add a **region tag** covering the entire file
