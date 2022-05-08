package chapter3;

import java.util.Scanner;

/*
 * SWITCH
 * Have a user enter their letter grade, and using a switch statement,
 * print out a message letting them know how they did.
 */
public class GradeMessage {
    public static void main(String[] args)
    {
        System.out.println("Enter your grade");
        Scanner scanner =new Scanner(System.in);
        String grade= scanner.next();
        scanner.close();

        String message;

        switch(grade)
        {
            case "A":
                message="Excellent Job";
                break;
            case "B":
                message="Great job";
                break;
            case "C":
                message="Goog job";
                break;
            case "D":
                message="You need to work a bit harder";
                break;
            default:
                message="Error invalid grade";
                break;

        }

        System.out.println(message);

    }
}
