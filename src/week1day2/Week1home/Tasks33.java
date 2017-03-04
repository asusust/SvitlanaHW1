package week1day2.Week1home;

import java.util.Scanner;

/**
 * Created by asustek on 03.03.2017.
 */
public class Tasks33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first;
        first = scanner.nextInt();
         if(first%7 == 0){
             System.out.println( first * 2);
         }
         else{
             System.out.println("It's bad");
         }
    }
    }

