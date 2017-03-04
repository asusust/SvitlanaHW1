package week1day2.Week1home;

import java.util.Scanner;

/**
 * Created by asustek on 27.02.2017.
 */
public class Task31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first;
        first = scanner.nextInt();
        System.out.println("first =" + first);
        if (first >= 0 && first <= 24) {
            if (first >= 9 && first <= 18) {
                System.out.println("I'm at work");
            } else {
                System.out.println("I'm at home");

            }
        } else {
            System.out.println("Number is not ok");

        }
    }
}


