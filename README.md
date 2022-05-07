# Java
Java Programming

Setting Up Java on Windows:
Download Java OpenJDK 11
https://jdk.java.net/java-se-ri/11

Extract it to C:\ Folder 

Set Path of JAVA in Cmd:
set path=%PATH%;C:\jdk-11\bin

Check Version: 
java -version

Now we are able to run the Java - only for that perticular session.
If cmd promt is closed we need to set the path again.

By Setting the environment variable we can run java permanentaly.

Setting Java as Environment variable:
My Computer->Right Click - Properties -> Advanced System Settings -> Advanced tab -> Environment variables 
->Click New in System Variables -> Give name JAVA_HOME and value extracted path (C:\jdk-11)

Append the JAVA_HOME sys variable to path Variable
Select Path from system variable -> click Edit -> add %JAVA_HOME%\bin


Now we can run java n number of times

Installing IntelliJ Idea:
IntelliJ Idea Community 

download the community version from below link
https://www.jetbrains.com/idea/download/

Download .exe and install


Installation prompt opens and click next select location for install.
click Run to open or open from desktop shortcut.

All required plugins will be installed automatically.

Click New Project and give name.
Select Class and create a new class under a project

------------------------------------
chapter 1 : Programming and algorithm

chapter 2 : Java Fundamentals
Java Package 
folder or container that holds java files.
you can have multiple packages.

right click on src -> select package -> should be all lower case.
say chapter2

packages contains java files also known as classes
new -> java class -> start with upper case "GrossPayCalculator"

now class with .java extention created under chapter2 package.
GrossPayCalculator.java
{} -> block of code
package, public, class are reserved words in java. There is something defined for these. they colored in orange

method will be created inside class.
in order to run any code within a class it must be inside method.
public staic void main(String arg[]) - default method in java.

when we execute it looks for main method. startring point of code.

// used to comment a line - for humans to read

System.out.println() -> to display out put to console.
; ending statements in java

To read input we use
Scanner scanner = new Scanner(Sytem.in)

we need to import the Scanner class
Alt + Enter in windows to import class
import java.util.Scanner; should be before class declaration.

To recieve input
Scanner.nextInt();
Scanner.nextDouble();
select data type as per input.

variable declaration
We need variable to store the input.
int hours = scanner.nextInt();

double rate = scanner.nextDouble();

We need to close class scanner after use to free up space.
scanner.close();

we can add numbers to variable but it cannot start with number
grosspay1
pay$
   '-' is not allowed
-----------------
Chapter 3a : If Statements




