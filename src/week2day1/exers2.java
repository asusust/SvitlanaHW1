package week2day1;

/**
 * Created by asustek on 04.03.2017.
 */
public class exers2 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[20];

        int counter = 0;
        while (counter != array2.length) {
            array2[counter] = (int) (Math.random() * 18);
            System.out.println(array2[counter] + " ");
            counter++;
        }
    }
}