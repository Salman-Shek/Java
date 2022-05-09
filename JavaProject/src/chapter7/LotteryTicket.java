package chapter7;
/**
 * Array program to generate random lottery numbers
 */

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {
    public static final int LENGTH =6;
    public static final int MAX_TICKET_NUMBER = 69;
    public static void main(String[] arg){

        int[] array;
        array = generateNumbers();
        Arrays.sort(array);
        for (int i =0; i<LENGTH;i++){
            System.out.print(array[i]+" | ");
        }

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
