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


Now we can run java n number of times.


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
