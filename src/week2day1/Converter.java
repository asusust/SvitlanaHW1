package week2day1;

import java.util.Arrays;

/**
 * Created by asustek on 04.03.2017.
 */
public class Converter {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = {10, 0, -23, 30};
        array1[0] = 5;
        array2[2] = 4;

        // java8
        int mult = Arrays.stream(array2)
                .reduce((left, right) -> left * right)
                .getAsInt();

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10);
            System.out.println(array1[i] + " ");
        }

        // System.out.println("Array1 has leght:" + array1.lenght);
        // System.out.println("Array2 has leght:" + array2.lenght);

    }

}
