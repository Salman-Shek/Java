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
Desicion structers

The if statement : If a certain situation occurs, do something and then go back to the main flow.
/* anything inside this is comment 
*/
Any values is given in problem statement  then initailize the know values by assining varaibles

if(condition need to evaluate) must result to boolean true/false, 1/0
{
code under here will be executed if result is true
}
if not continue with program

salary = salary +250
memory location = value 
-------------------
Chapter 3b: if-else statements
If a certain situaition occurs
<do something>

otherwise
<do something else> 

if(sales >= quota)
	System.out.println("Congrats you met quota");
else
{
	salesshort=quota-sales
	System.out.println("Did not make your quota");
}

if only one statement inside condition then no need of curly braces {}
-------------------
chapter 3c : Nested If Statemnets
If a certain condition is met, it goes inside the if block and is immediately faced with yet another if statement. 

if(salary>=requiredSalary)
{
	if(year>=requiredYearsEmployed)
	{
		System.out.println("Congrats you are Qualified");
	}
	else
	{
		System.out.println("Number of years worked not met");
	}
}
else
{
	System.out,println("Sorry, you salary not qualifies for loan");
}
-------------------
chapter 3d: IF-ELSE-IF statements
If situation A occurs, do something.
Else if situation B occurs, do something else.
Else if situation C occurs, do something else.

if(score < 70)
        {
            grade ='D';
        }
        else if(score <80)
        {
            grade='C';
        }
        else if(score < 90)
        {
            grade ='B';
        }
		else
			garde = A
-------------------
chapter 3e: Switch statements
If situation A occurs, do something.
Else if situation B occurs, do something else.
Else if situation C occurs, do something else.

same as if else if.
but checks for equality.

switch(grade)
{
	case "A":
		message ="Excellent job";
		break;
	Case "B":
		message="Good job";
		break;
	default:
		message="uh Oh!";
		break;	
}
----------------------
chapter 3f: Relational and Logical Operators

Relational operators 
greater than: >
less than: <
greater than or equal to: >=
less than or equal to: <=
equal to: ==
not equal to: != 

Equal Operator: ==

Notice the equal to operator is two equal signs ( == ). In Java the single equal sign ( = ) is used for assignment, like when we assign a value to a variable. So, you cannot use that in a condition to compare values.

comparing String
if(String1.equals(string2)) = to check if 2 strings are same
if(!string1.equals(string2)) = to check if string are not equal
if(string1.equalsIgnoreCase(string2)) = check withot case sensitive

Logical operators
&&  AND : both conditions must be true
|| OR	: at least one condition must be true
! NOT 	: condition must be false

