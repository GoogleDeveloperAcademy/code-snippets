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
Check if this repository has been set up to be mirrored into `Gerrit (Git-on-Borg)`.
- Go to: https://github.git.corp.google.com/
- Paste `GoogleDeveloperAcademy` in the repository to find for field
- Press `FIND` and check if the `code-snippets` repository has been mirrored

### Step 2:
Clone this repository locally and create new branch to work on. After completing this step, you should be able to see a branch after your \<USERNAME\> in this repository.
```sh
git clone https://github.com/GoogleDeveloperAcademy/code-snippets
cd code-snippets
git checkout -b <USERNAME>
git push --set-upstream origin <USERNAME>
```
![image](https://user-images.githubusercontent.com/7249208/120732817-f09dde00-c4b3-11eb-80e4-464a97c59221.png)


#### Step 2:
Add a **region tag** covering the entire source code file [`android_client.kt`](/android_client.kt).
```sh
# add the region as explained in the slides encompassing the whole file
# save the file
git add android_client.kt
git commit -m "chore: add first region tag"
git push
```

#### Step 3:
Update the iX document `adding-snippets.md` under your google3 GDA workspace to include code from this file using the **includecode** template tag. For this step include the code in the space where you find the first **TODO** in the document.

<img width="949" alt="Screen Shot 2021-06-03 at 21 43 49" src="https://user-images.githubusercontent.com/7249208/120733305-e6c8aa80-c4b4-11eb-983e-efc3f06b4592.png">

> 🎯 HINT 1: To point to a region_tag from a specific **git branch** use the **git_revision** attribute of the **includecode** template.  
> 🎯 HINT 2: The expected format for the **git_revision** attribute is `refs/heads/<BRANCH_NAME>`

#### Step 4:
Stage and view the iX document _(adding-snippets.md)_ through `Cider`.
- **Cider > Tools > DevSite > Stage current file**
- **Cider > Tools > DevSite > Open staged file**

🚀 ⚡**YOU SHOULD SEE THE CODE FROM THE `android_client.kt` FILE RENDERED IN THE DOCUMENT** ⚡🚀

---

#### Bonus steps:
- Add 5 different region tags to each of the different sections ([1](https://github.com/GoogleDeveloperAcademy/code-snippets/blob/main/android_client.kt#L9), [2](https://github.com/GoogleDeveloperAcademy/code-snippets/blob/main/android_client.kt#L15), [3](https://github.com/GoogleDeveloperAcademy/code-snippets/blob/main/android_client.kt#L18), [4](https://github.com/GoogleDeveloperAcademy/code-snippets/blob/main/android_client.kt#L30), [5](https://github.com/GoogleDeveloperAcademy/code-snippets/blob/main/android_client.kt#L42)) in the [`android_client.kt`](/android_client.kt) file and include each of them seperately in place of the 5 `TODO`s in the iX document _adding-snippets.md_
- Try to highlight specific sections of different sections
- Try if you can create a second language tab for `Groovy` _(you can include the same Kotlin code to practice)_
