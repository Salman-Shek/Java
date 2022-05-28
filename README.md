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
If cmd prompt is closed we need to set the path again.

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
public static void main(String arg[]) - default method in java.

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
Any values given in problem statement  then initailize the known values by assining varaibles.

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
		grade = A;
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

 //Way to make the decimal print with only 2 decimal places
 String.format("%.2f", amountShort)
 
 --------------------
 chapter 4a: while loop
 Repetition structures
 
Loops are structures that cause a block of code to repeat.
while(condtion>1)
{
	condtion = 0;		-> sentinel
}
Sentinel -> condition controls the loop
----------------------
chpater 4b: do while
boolean again =false;   ->Sentinel
do{
} while();

while and do-while are conditionion controlled loops.
--------------------
chapter 4c: For loop
iterates for certain number of times
for (int i=0;i<quantity;i++)
{
}

lenth() -> gives the lenth of string
charAt(i)-> gives the charcter at perticular position

For loop is count controlled loop.
---------------------
Chapter 4d: Nested Loop
Sometimes your repetitive tasks also contain repetitive sub-tasks. In the case, you need a loop inside of a loop.

-------------------
chapter 5a: Methods

Methods are used to break complex problem into small managable pecieces
functions, modules - in java its methods
main() is also method
scanner() to input data
System() used to output data

parts of method

header

first word in header is
access modifier<public,private,protected> - who is allowed to access the code
if not specified can be access by classes within package.

second word in header is
non-access modifier (static,final,abstract,synchronized)
not every method requires one of these modifiers

third word in header is
return type - the data type this method will return back to the caller.
void - not going to return any value
method can only return 1 value.

fourth word in header is 
name - every method should have name. begin with verb and knowns follow (calculateSum)
should begin with lowercase

next is set of paranthesis
() can be empty if method needs no external data
used to hold list of all the data that should be supply to the method
, delimited input

signature - name and parameters

method body {}
contains zero or more statements.

if return type is anything other than void then we need return inside body

public static void main()
{
 String name = scanner.next();
 greetUser(name);
 }
 public static void greetUser(String name)
 {
  system.out.println(name);
  }
----------
chapter 5b: Variable Scope
variables defined within method are local variables
variables defined outside method and inside class are called global variables

the scope of method parameter is anywhere within the method
methods will return only 1 value.
we are not required to recieve returned value from calling method.
Arguments and their corresponding parameters may or may not have the exact same name.
A calling method’s argument list must be in the exact same order as the receiving method’s parameter list.
--------------
chapter 6a: Classes and Objects
java is a object oriented programming language.
Objects are structures which contain data in the form of fields and methods.

Components of Class - fields and methods

1. Getter and Setter Methods:
One is to provide getter and setter methods for each of the fields.
public double getWidth(){
    return width;
}

public void setWidth(double width){
    this.width = width;
}

The this keyword refers to this class.

2. Constructors:
All objects have a constructor.
The very first type of constructor is the default constructor.
public Rectangle(){
    length = 0;
    width = 0;
}
The default constructor is known as such because it does not have a parameter list

The constructor's name must be the exact same name as the class.
Constructors start with an access modifier, so we'll say public.
there's no return type, because they're not a method, even though they kind of act like one
Constructors are used to initialize an object, or set up its state in some way

You can have however many constructors you want. All of their names must be exactly as the class name. What differs is the parameters that they accept.

Another thing about classes is that they should practice encapsulation.

Encapsulation is one of the key principles of object-oriented programming. 
It specifies that the data (fields) of a class should be private and 
the methods (behaviour) of the class can be exposed (public) to other classes to use.

No other code outside of this class can access things that are marked as private.
with no access modifier, only classes within the same package (chapter6) can access these methods.
public - can be accessed outside the package
protected - it means that other classes within this same package can access it. It's similar to having no access modifier at all.

--------------
chapter 6b : instantiating object

Rectangle room1 = new Rectangle();
datatype object = new default constructor; or another constructor with parameters

we can give class types as data type.
To create an instantiation or an instance of an object we use the key word new, followed by the constructor of the class we are creating object of.
room1 (this is the object), and access the object’s methods using the dot operator (.).
----------
chapter 6c: Objects as method parameters and return type

primitive data type this means things like the int and the char.
However, we can use objects as the arguments for methods, as well.
For classes that are not within the same package, you have to import them.

Static Non-Access Modifier

Static is used for members of a class which can be accessed without using an instance of the class to do so. Because it’s not associated with an instantiation, 
these members have no state.
we've created an instance of the very class that we were in, just so that we could get the things that are not static within this class.

Classes that exist outside of the package in which they are being used must be imported.
For a static method to be able to call a non-static method, it must do so by Using an object of the type in which the non-static method belongs
Static global fields can be accessed by non-static methods of the same class

In Java, default constructors exist in classes with no constructors, even if not explicitly defined.

--------------------
chapter 6d : Overloading methods within a class

Overloading Methods

Within a class, you can have multiple methods that have the same name but different signatures. And this is known as overloading.
------------------------
chapter 7a : Arrays

Arrays are special objects or containers which can hold multiple values.

int[] lottoTicket = new int[6];
int lottoTicket[] = new int[6];

int - the first part is the data type that the array holds and while the array is capable of holding multiple values, all values must be of the same data type

[] - the square brackets indicate that this is not just an int data type, but this will be an array of “ints”. The bracket can appear after the data type or after the variable name itself

lottoTicket - speaking of name, that's the next part of the declaration. We name arrays just as we would any other variable

= - the name is followed by an equal sign

new - and then we use the new keyword

int - followed by the data type again

[6] - followed by a number inside of the brackets. This number inside of the brackets represents the length of the array, meaning how many values can this array store. Once the length is declared, 
it's fixed — meaning it cannot be lengthened to hold more values.

using contant variable
private static final int LENGTH = 6 - declare gloabal variable
int[] lotteryNumb = new int[LENGTH]

----------------------
chapter 9a: Inheritance
Java is an Objected Oriented Programing Language.
we use the paradigm of objects to represent a concept, and to hold state and behavior.

There are 4 major Principles of OOPS are EIPA
Encapsulation 	: in a class variable to be private and methods to be public.
Inheritance		: Inheritance is where one class becomes an extension of another class, therefore inheriting the members of that class.
Polymorphism	: Polymorphism is the ability to take multiple forms
Abstraction		: Abstraction is defined as something that exists in theory but does not have a concrete existence

Inheritance 
2 parties : Parent and child
Parent class - Supercalss - base class
Child class- subclass - derived class

public class Person{
	private String name;
    private int age;
    private String gender;
	
	//getter and setter
}
public class Employee extends Person{
	private String employeeId;
    private String title;
}

Person is Super class and Employee is subclass

chapter 9b:
by default The supercalss constructor is called first before subclass.

to call a specific constructor of superclass use super()

super() -> calls the default constructor
super(name) -> if we want to call other then give parameter as defined.
it should be the first line of the subclass constructor.

if you defined a constructor then the default constructor is no longer available if its not explicitly defined.

Overriding and overloading:
Subclass inherits the member of its parent.
if we need to change the functionality of method . overriding method.

So, this is how you override a method — use the exact same signature but change the body.

Override Annotation

It's encouraged that you use the override annotation, which is the @ symbol followed by the word Override — @Override. This is not required, but it's strongly encouraged. 
This lets Java know that your intention is to override the method that you inherited from your super class.

Overloading Inherited Methods:
Overloading methods is when you have multiple methods with the exact same name but with different parameter lists.
When dealing with a subclass, we can overload a method that we have inherited from a superclass, even though that method lives in another class.

When we use overloaded method in subclass we get access to both supercalss method and subclass method.
but super class gets access to only its method.

Cunstructors are not members of class so they cannot be inherited. but the parent constructor can be used using super() funtion;
public and protected method, fields in a super class are inherted by its subclass.
private method and fields are not inherited.
final methods are inherited but cannot be overidden.

public in super to protected not allowed
protected in super to public in subclass allowed.

All classes in Java, whether provided by the language or created by you, inherit from the Object class
-----------------------------------
Chapter 10 : Polymorphism
Polymorphism is the ability to take multiple forms. Specifically, in object-oriented programming, 
polymorphism is where a subclass can define their own unique behaviors, and yet share some of the same behaviors of their superclass.

An example of polymorphism is where an object has a superclass type but is an instance of a subclass.
Animal sasha = new Dog();
sasha = new Cat();
Because they are both of type Animal, and since I've specified sasha as type Animal, then this is legal.

Type Casting
Casting is the act of converting an object’s type into a different type.

((Cat) sasha).scratch(); to call a method of Cat class then it needs to be type casted.


if(animal instanceof Dog) returns boolean
------------------------------------
chapter 11a: Abstraction
Abstraction is defined as something that exists in theory but does not have a concrete existence

we have reserved word abstarct which is non-access modifier can be used in class and methods.

public abstract class Shape{
 abstract double calculateArea();
 }
when we want to define template but not using as is.
An abstract method has no body, only the signature of the method is defined
An abstract class doesn't only have to contain abstract methods

we cannot instantiate abstract class as they are template. we can use it as type.

Given a class contains an abstract method. The class itself must be abstract.
-----------------------
Chapter 11b: interfaces
An interface is similar to an abstract class, except that in an abstract class there can be some methods that are implemented.
interface consists of all abstract methods. Because all of the methods of an interface are abstract by nature, there's no need to declare the methods as abstract. It's just a given.

public inteface Product{			-- interface 
}

public class Book implements Product{
}

class specify that it will implement multiple interfaces
By providing the list of names of the interfaces, separated by commas, within the class header
If a class indicates that it will implement multiple interfaces, then it must provide implementation for all abstract methods of those interfaces.

chapter : collections
A Collection is an object that holds references to other objects. These are data structures and the objects within the collection are known as elements.

Set : unorder collection of unique objects, HashSet()
List : ArrayList(); ordered. index start at 0., can be duplicated. it prints in order we entered.
Queue : LinkedList(); items are ordered, can be duplcate, first in first out.
Map : HashMap(), treemap(); maps unique keys to values


try{
}
catch(Exception1 | Exception2 e)
{
e.printStackTrace();
}
finally			-- if or no exception
{
scanner.close();
}