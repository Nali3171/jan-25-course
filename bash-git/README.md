# Git Bash / Terminal Commands

---

## **File and Directory Management**

### **View Current Directory**

-   **macOS/Linux:** `pwd`
-   **Windows:** `cd`

### **List Files and Directories**

-   **macOS/Linux:** `ls` (add `-la` for detailed view)
-   **Windows:** `dir`

### **Change Directory**

-   **Both:** `cd <directory_name>`

### **Create a Directory**

-   **Both:** `mkdir <directory_name>`

### **Delete a Directory**

-   **macOS/Linux:** `rm -r <directory_name>`
-   **Windows:** `rmdir /s <directory_name>`

### **Create a File**

-   **macOS/Linux:** `touch <file_name>`
-   **Windows:** `type nul > <file_name>`

### **Delete a File**

-   **macOS/Linux:** `rm <file_name>`
-   **Windows:** `del <file_name>`

---

## **File Operations**

### **Copy a File**

-   **macOS/Linux:** `cp <source> <destination>`
-   **Windows:** `copy <source> <destination>`

### **Move or Rename a File**

-   **macOS/Linux:** `mv <source> <destination>`
-   **Windows:** `move <source> <destination>`

### **Read File Content**

-   **macOS/Linux:** `cat <file_name>`
-   **Windows:** `type <file_name>`

---

## **System and Process Management**

### **View Running Processes**

-   **macOS/Linux:** `ps aux` or `top`
-   **Windows:** `tasklist`

### **Kill a Process**

-   **macOS/Linux:** `kill <PID>` or `kill -9 <PID>`
-   **Windows:** `taskkill /PID <PID> /F`

### **Check System Info**

-   **macOS/Linux:** `uname -a`
-   **Windows:** `systeminfo`

---

## **Networking**

### **Check Connectivity**

-   **Both:** `ping <hostname>` (e.g., `ping google.com`)

### **Display IP Address**

-   **macOS/Linux:** `ifconfig` or `ip addr`
-   **Windows:** `ipconfig`

---

## **Search and Find**

### **Search for Files**

-   **macOS/Linux:** `find . -name "<file_name>"`
-   **Windows:** `dir <file_name> /s`

### **Search Inside Files**

-   **macOS/Linux:** `grep "<text>" <file_name>`
-   **Windows:** `findstr "<text>" <file_name>`

---

## **Permissions and Ownership**

### **Change File Permissions**

-   **macOS/Linux:** `chmod <mode> <file_name>`
-   **Windows:** Use the GUI or `icacls <file_name> /grant <User>:<permissions>`

### **Change Ownership**

-   **macOS/Linux:** `chown <user>:<group> <file_name>`
-   **Windows:** `takeown /f <file_name>`

---

## **Utilities**

### **Clear Terminal**

-   **macOS/Linux:** `clear`
-   **Windows:** `cls`

### **View Disk Usage**

-   **macOS/Linux:** `df -h` or `du -sh`
-   **Windows:** `dir` or check disk usage in the File Explorer.

### **Compress Files**

-   **macOS/Linux:** `tar -czvf <archive_name>.tar.gz <file_or_directory>`
-   **Windows:** `Compress-Archive -Path <file_or_directory> -DestinationPath <archive_name>.zip` (PowerShell)

---

## **Git Commands**

-   `git init` - Initialize a Git repository.
-   `git clone <repository_url>` - Clone a repository.
-   `git add <file_name>` - Stage changes.
-   `git commit -m "<message>"` - Commit changes.
-   `git push` - Push changes to the repository.
-   `git pull` - Pull updates from the repository.

---

## **Useful Shortcuts**

-   **Cancel a Running Command:**
    -   **Both:** `Ctrl + C`
-   **Autofill Command/Path:**
    -   **Both:** `Tab`
-   **Scroll Through Command History:**
    -   **Both:** `Up Arrow` and `Down Arrow`

---

## Git Flow

### Main worflow when working with Git

    git init
        > git add .
            > git commit -m "Commit Message"
                > git push origin <branch>

    git branch <new-branch> <original branch>
        > git add .
            > git commit -m "Commit Message"
                > git push origin <branch>

### When cloning a repo

-   Clone an existing repository:

```bash
    Via SSH
    $ git clone ssh://user@domain.com/repo.git


    Via HTTP
    $ git clone http://domain.com/user/repo.git
```

-   Create a new local repository in the current directory:
    ```bash
    $ git init
    ```

### Handling Local Changes

-   Checking for changes in working directory:

    ```bash
    $ git status
    ```

-   Checking for changes to tracked files:

    ```bash
    $ git diff
    ```

-   See changes/difference of a specific file:

    ```bash
    $ git diff <filename>
    ```

-   Add all current changes to the next commit:

    ```bash
    $ git add .
    ```

-   Add only the mentioned files to the next commit:

    ```bash
    $ git add <filename1> <filename2>
    ```

-   Commit with message:

    ```bash
    $ git commit -m "message here"
    ```

-   Move uncommitted changes from current branch to some other branch:
    ```bash
    $ git stash
    $ git checkout branch2
    $ git stash pop
    ```

### Handling Branches

-   List all local branches:

    ```bash
    $ git branch
    ```

-   List local/remote branches:

    ```bash
    $ git branch -a
    ```

-   Switch HEAD (current) branch:

    ```bash
    $ git checkout <branch>
    ```

-   Create a new branch from an exiting branch and switch to new branch:

    ```bash
    $ git checkout -b <new_branch> <existing_branch>
    ```

-   Create a new branch based on your current HEAD:

    ```bash
    $ git branch <new-branch>
    ```

-   Delete a local branch:

    ```bash
    $ git branch -d <branch>
    ```

-   Rename current branch to new branch name:

    ```bash
    $ git branch -m <new_branch_name>
    ```

-   Force delete a local branch (You will lose unmerged changes!):
    ```bash
    $ git branch -D <branch>
    ```

### Handling Updates and Publishes

-   List all current configured remotes:

    ```bash
    $ git remote -v
    ```

-   Add new remote repository, named <remote>:

    ```bash
    $ git remote add <remote> <url>
    ```

-   Remove a remote:

    ```bash
    $ git remote rm <remote>
    ```

-   Download all changes from <remote>, but don't integrate into HEAD:

    ```bash
    $ git fetch <remote>
    ```

-   Get all changes from HEAD to local repository:

    ```bash
    $ git pull origin master
    ```

-   Publish local changes on a remote:
    ```bash
    $ git push remote <remote> <branch>
    ```
