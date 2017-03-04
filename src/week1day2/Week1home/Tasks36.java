package week1day2.Week1home;

import java.util.Scanner;

/**
 * Created by asustek on 02.03.2017.
 */
public class Tasks36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first;
        int second;
        int sum;
        first = scanner.nextInt();
        System.out.println("first =" + first);
        second = scanner.nextInt();
        System.out.println("second =" + second);
        sum = first + second;
        if (sum >= 11 && sum <= 19) {
            System.out.println("It's good");
            System.out.println("sum=" + sum);
        }
    }
}




