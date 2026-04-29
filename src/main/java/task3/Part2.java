package task3;

public class Part2 {

    public static void main(String[] args) {
        int[] arrayDigits = {5987, 1, -5, 8, 123, -87};
        int maxNumber = arrayDigits[0];
        for (int i = 0; i < arrayDigits.length; i++) {
            if (maxNumber < arrayDigits[i]) {
                maxNumber = arrayDigits[i];
            }
        }
        System.out.println(maxNumber);
    }
}
