# Listing_4_16_1411_Project: How to generate a random upper case letter.

## Introduction

This document details the generation of a Java program that writes an uppercase letter to the console. This code is managed inside Github.com and uses the Math.random() method as well as a custom method call.

## Outline
``` java
// Generate a random uppercase letter (using a custom method call)
// Print the random letter to the console.
```

## References and Literature
// Liang Java 10th edition. Pg 87, Listing 3.3
// This is an example of how to make a random number.
// int number1 = (int)(Math.random()*10);

// Liang Java 10th edition. Pg 125, Table 4.4
// We can map from integers to Capital letters
// Characters �A� to �Z� have a Value in Decimal of 65 to 90.

// Liang Java 10th edition. Pg 122, 4.2.5 the random method.
// a + Math.random() * b
// returns a random number between a and a+b, excluding a+b.

// Liang Java 10th edition. Pg 209, 6.4, void Method Example.
// This shows how we can set up a method call.

## Code

## Console

## Command Prompt

1. Open Eclipse and start new project
	a. may need to change to your workspace
2. Go to Github and start a new repository.

3. Use the command prompt to make the connections.


a. Navigate to the correct location. Looking for src and bin folders.

Move to the E: drive:
```
C:\Users\LAB>E:
```
*dir* shows what is in the directory.
```
E:\>dir
 Volume in drive E has no label.
 Volume Serial Number is CF21-6DC3

 Directory of E:\

10/09/2015  08:03 AM    <DIR>          COMSC_1033_Workspace
10/13/2015  11:53 AM    <DIR>          COMSC_3603
10/18/2015  04:09 PM    <DIR>          Github_Workspace
10/29/2015  10:25 AM    <DIR>          COMSC_3603_Workspace
               3 File(s)     16,394,783 bytes
              14 Dir(s)   8,059,305,984 bytes free
```
*cd COMSC_1033_Workspace* Changes to the correct eclipse workspace.
```
E:\>cd COMSC_1033_Workspace

E:\COMSC_1033_Workspace>cd Listing_4_16_1411_Project
```
Use *dir* again to make sure we can see the src and bin files.
```
E:\COMSC_1033_Workspace\Listing_4_16_1411_Project>dir
 Volume in drive E has no label.
 Volume Serial Number is CF21-6DC3

 Directory of E:\COMSC_1033_Workspace\Listing_4_16_1411_Project

11/02/2015  09:14 AM    <DIR>          .
11/02/2015  09:14 AM    <DIR>          ..
11/02/2015  09:14 AM               401 .project
11/02/2015  09:14 AM    <DIR>          src
11/02/2015  09:14 AM    <DIR>          bin
11/02/2015  09:14 AM               232 .classpath
               2 File(s)            633 bytes
               4 Dir(s)   8,059,305,984 bytes free

E:\COMSC_1033_Workspace\Listing_4_16_1411_Project>
```
And now we add the readme file. This is the start of directions from Github.
```
E:\COMSC_1033_Workspace\Listing_4_16_1411_Project>echo # Listing_4_16_1411_Proje
ct >> README.md
```
Continue to work through the instructions online.

Initialize our repository.
```
E:\COMSC_1033_Workspace\Listing_4_16_1411_Project>git init
Initialized empty Git repository in E:/COMSC_1033_Workspace/Listing_4_16_1411_Pr
oject/.git/
```
Add our files to the staging area.
```
E:\COMSC_1033_Workspace\Listing_4_16_1411_Project>git add .
```
Configure our user name and password.
```
E:\COMSC_1033_Workspace\Listing_4_16_1411_Project>git config user.name "Jeremy E
vert"

E:\COMSC_1033_Workspace\Listing_4_16_1411_Project>git config user.email "jeremy.
evert@swosu.edu"
```
Commit our changes.
```
E:\COMSC_1033_Workspace\Listing_4_16_1411_Project>git commit -m "first commit"
[master (root-commit) ba507c7] first commit
 5 files changed, 29 insertions(+)
 create mode 100644 .classpath
 create mode 100644 .project
 create mode 100644 README.md
 create mode 100644 bin/Listing_4_16_1411.class
 create mode 100644 src/Listing_4_16_1411.java
```
Make the connections between our repository and Github.
```
E:\COMSC_1033_Workspace\Listing_4_16_1411_Project>git remote add origin https://
github.com/jeremy-evert/Listing_4_16_1411_Project.git

E:\COMSC_1033_Workspace\Listing_4_16_1411_Project>git push -u origin master
Username for 'https://github.com': jeremy.evert@swosu.edu
Password for 'https://jeremy.evert@swosu.edu@github.com':
Counting objects: 9, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (8/8), done.
Writing objects: 100% (9/9), 1.27 KiB | 0 bytes/s, done.
Total 9 (delta 0), reused 0 (delta 0)
To https://github.com/jeremy-evert/Listing_4_16_1411_Project.git
 * [new branch]      master -> master
Branch master set up to track remote branch master from origin.
```

E:\COMSC_1033_Workspace\Listing_4_16_1411_Project>

