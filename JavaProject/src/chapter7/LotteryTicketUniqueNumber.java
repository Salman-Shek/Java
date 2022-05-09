package chapter7;
/*
 * Array program to generate random lottery numbers which are unique.
 * Using Sequential Search
 */
import java.util.Arrays;
import java.util.Random;

public class LotteryTicketUniqueNumber {
    public static final int LENGTH =6;
    public static final int MAX_TICKET_NUMBER = 69;
    public static void main(String[] arg){

        int[] ticket;
        ticket = generateNumbers();
        Arrays.sort(ticket);
        for (int i =0; i<LENGTH;i++){
            System.out.print(ticket[i]+" | ");
        }

    }
    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for(int i=0;i<LENGTH;i++){
            int randomNumber;
            do {
                randomNumber=random.nextInt(MAX_TICKET_NUMBER)+1;
            }while(search(ticket,randomNumber));
            ticket[i] = randomNumber;
        }
        return ticket;
    }

    public static  boolean search(int[] array, int numberToSearch){
        /*
          This is called an enhanced loop.
          It iterates through 'array' and
          each time assigns the current element to 'value'
         */
        for(int value : array) {
            if(value == numberToSearch)
                return true;
        }
        return false;
    }
}
