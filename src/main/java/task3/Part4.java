package task3;

import java.util.Arrays;

public class Part4 {

    public static void main(String[] args) {
        int[] arrayDigits = {1, -5, 8, 12, -7, -16, 22};
        int zeroValue = 0;
        for (int i = 0; i < arrayDigits.length; i++) {
            if (arrayDigits[i] < 0) {
                arrayDigits[i] = zeroValue;
            }
        }
        System.out.println("test");
        System.out.println(Arrays.toString(arrayDigits));
    }
}
