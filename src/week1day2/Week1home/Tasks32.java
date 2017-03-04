package week1day2.Week1home;

import java.util.Scanner;

/**
 * Created by asustek on 02.03.2017.
 */
public class Tasks32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a ;
        int b ;
        int c ;
        int max;
        int min;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        max=Math.max(a,b);
        min=Math.min(a,b);
        max = Math.max(c, max);
        min=Math.min(c, min);
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
        System.out.println("max=" + max);
        System.out.println("min=" + min);





    }
}