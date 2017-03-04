package week2day1;

/**
 * Created by asustek on 04.03.2017.
 */
public class Some {
    public static void main(String[] args) {
        int value = 25;
        String bin = decToBin(value);
        System.out.println(bin);
        int valueAfterConvert = binToDec(bin);
        System.out.println(valueAfterConvert);
    }

    public static String decToBin(int value) {
        String result = " ";
        while (value > 1) {
            result += value % 2;
            value /= 2;
        }
        result += value;
        result = new StringBuilder(result)
                .reverse()
                .toString();
        return result;
    }

    public static int binToDec(String bin) {
        String reversedValue = new StringBuilder(bin)
                .reverse()
                .toString();
        char[] letters = reversedValue.toCharArray();
        int result = 0;
        for (int i = 0; i < bin.length(); i++) {
            if (letters[i] == '1') {
                result += Math.pow(2, i);
            }

        }
        return result;
    }
}
