package week2day1;

/**
 * Created by asustek on 04.03.2017.
 */
public class ArraysBrealCont {
    public static void main(String[] args) {
        int[] mas1 = Utils.generateArrays(10, 0, 5);
        Utils.printArray(mas1);

        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] == 2) {
                System.out.println(" 2 is on idex " + i);
                break;

            }
        }
        for (int i = 0; i < mas1.length; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(mas1[i] + " ");

        }

    }
}

