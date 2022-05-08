package chapter4;


import java.util.Scanner;

public class LetterSearch {
    public static void main(String[] arg){

        //Get text
        System.out.println("Enter some text");
        Scanner scanner = new Scanner(System.in);
        String text =scanner.next();

        System.out.println("Enter the letter you want to search");
        String letter = scanner.next();

        scanner.close();

        boolean letterFound = false;
        int i;
        //Search text for a letter
        for(i=0;i<text.length();i++){
            String currentLetter = String.valueOf(text.charAt(i));
            if(currentLetter.equalsIgnoreCase(letter)){
                letterFound = true;
                break;
            }
        }
        if(letterFound){
            System.out.println("This text "+text+" contains the letter '"+letter +"' at position "+ (i+1));
        }
        else
            System.out.println("The text "+text+" does not contains the letter '"+letter+"'");

    }
}
