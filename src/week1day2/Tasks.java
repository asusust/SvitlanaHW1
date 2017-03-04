package week1day2;

import java.util.Scanner;

/**
 * Created by asustek on 26.02.2017.
 */
public class Tasks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // System.out.println("Please enter word  for search");
        System.out.println("Please enter text");
        String text = scanner.nextLine();
        System.out.println("enter word for search");
        String word = scanner.nextLine();

        checkText(text, word);

      /*  boolean result = checkLength(text);
        System.out.println(result);*/
        int number = scanner.nextInt();
        boolean result = checkEven(number);
        System.out.println(number + " is even " + result);
    }




    public static boolean checkEven(int value) {
        if (value % 2 == 0) {

            return true;
        } else {
            return false;


        }


    }


    public static void checkValue(int x) {
        if (x <= 100 && x >= 10 && x % 2 == 0) {
            System.out.println(x + " is <= 100 and >= 10 and is even ");
        } else {
            System.out.println("Error");

        }

    }


    public static void checkText(String text, String word) {
        if( text.contains(word) && word.length() >5  ) {
            System.out.println( "Good, Word is found");
        } else {
            System.out.println( "bad! somethink wrong");

        }

    }


}