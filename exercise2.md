# Excercise 2

## Initial setup

1. git config --global user.name ""
- setting up git username

2. git config --global user.email ""
- setting up git email

3. git config --global init.defaultBranch main
- setting the default branch name to main

4. git clone 
- cloning the newly created repository on github.com to my computer

## Add, commit and .gitignore file

1. git add README.md and git add exercise1.md
- select files and move them to the staging area

2. git commit -m ""
- transfer files from staging area to repository
- the option -m allows you to include an inline-message related to the commit

3. .gitignore file
- before committing the .gitignore file it is listed in "Unversionierte Dateien" (using git status)
- after committing it's not listed in this section anymore

## Description

`git config`: command used for specifying git configuration settings \
`git init`: with this command you start tracking your project, creates a subdirectory .git \
`git commit`: with this command the files are transfered from the staging area to repository \
`git status`: shows the states in which the files in the working directory are (staged files, not tracked files...) \
`git add`: move files to the staging area in order to commit them later \
`git log`: history of commits that happened with author and dates \
`git diff`: shows current changes and staged changes that are ready to commit, lists changes in files \
`git pull`: update your current working directory with the latest changes from the server \
`git push`: command to transfer commits between local and remote repository