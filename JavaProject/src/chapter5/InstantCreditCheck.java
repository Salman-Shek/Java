package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {

    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] arg){
        double salary = getSalary();
        int creditScore= getCreditScore();
        scanner.close();
        //Check if user is qualified
        boolean qualified = isUserQualified(creditScore,salary);

        //Notify user
        notifyUser(qualified);
    }
    public static double getSalary() {
        System.out.println("Enter your Salary:");
        return scanner.nextDouble();
    }
    public static int getCreditScore(){
        System.out.println("Enter your Credit score:");
        return scanner.nextInt();

    }
    public static boolean isUserQualified(int creditScore, double salary){
        if(creditScore >= requiredCreditScore && salary >= requiredSalary){
            return true;
        }
        else
            return false;
    }
    public static void notifyUser(boolean isQualified){
        if(isQualified)
            System.out.println("Congrats! You've been approved");
        else
            System.out.println("Sorry. You've been declined");
    }
}
