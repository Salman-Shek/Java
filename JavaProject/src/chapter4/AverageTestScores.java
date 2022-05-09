package chapter4;
/*
 * NESTED LOOPS:
 * Find the average of each student's test scores
 */
import java.util.Scanner;

public class AverageTestScores {
    public static void main(String[] arg){

        int numberOfStudent = 5;
        int numberOfTests = 4;

        Scanner scanner =new Scanner(System.in);

        for(int i=0; i<numberOfStudent;i++){
            double total =0;
            for(int j=0;j<numberOfTests;j++)
            {
                System.out.println("Enter the score for test #"+ (j+1) +" of Student " +(i+1));
                double score = scanner.nextDouble();
                total =total+score;
            }
            double average = total/numberOfTests;
            System.out.println("The test average for student #"+ (i+1) +" is "+average);
        }
        scanner.close();
    }
}
