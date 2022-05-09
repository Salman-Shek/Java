package chapter7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * Array program to generate random lottery numbers which are unique.
 * Using Binary Search
 */
public class LotteryTicketBinarySearch {
    public static final int LENGTH =6;
    public static final int MAX_TICKET_NUMBER = 69;
    public static void main(String[] arg){

        int[] ticket;
        ticket = generateNumbers();
        Arrays.sort(ticket);
        for (int i =0; i<LENGTH;i++){
            System.out.print(ticket[i]+" | ");
        }
        System.out.println();
        System.out.println("Enter the ticket number to be searched: ");
        Scanner scanner = new Scanner(System.in);
        int ticketNumber = scanner.nextInt();


        int index = Arrays.binarySearch(ticket, ticketNumber);
        if(index<0)
            System.out.println("Ticket number not found");
        else
            System.out.println("Ticket number found at position "+(index+1));
    }
    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for(int i=0;i<LENGTH;i++){
            ticket[i] = random.nextInt(MAX_TICKET_NUMBER)+1;
        }
        return ticket;
    }

}
