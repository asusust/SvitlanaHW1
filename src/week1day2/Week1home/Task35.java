package week1day2.Week1home;

import java.util.Scanner;

/**
 * Created by asustek on 02.03.2017.
 */
public class Task35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first;
        int second;
        first = scanner.nextInt();
        System.out.println("first =" + first);
        second = scanner.nextInt();
        System.out.println("second =" + second);
        if(first > second) {
            System.out.println( first - second);
        }
        else {
            System.out.println(first + second);
        }
    }
}
