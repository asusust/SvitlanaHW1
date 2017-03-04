package week1day2.Week1home;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * Created by asustek on 03.03.2017.
 */
public class Tasks37 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println("x=" + x);
        System.out.println("y=" + y);

        if (x % y == 0) {
            System.out.println(true);            ;
            System.out.println(x/y);
        }
             else {
            System.out.println(false);
        }
    }
}