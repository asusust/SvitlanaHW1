package week1day2.Week1home;

import java.util.Scanner;

/**
 * Created by asustek on 02.03.2017.
 */
public class Task34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float res1;
        res1 = scanner.nextFloat();
        System.out.println("res1=" + res1);
        if (res1 >= 0 && res1 <= 1) {
            System.out.println("It's good");
        } else {
            System.out.println("It's not good ");
        }
    }
}
