package task3;

public class Part3 {

    public static void main(String[] args) {
        int[] arrayDigits = {1, -5, 8, 12, -7, -16, 22};
        int countOfEvenNumbers = 0;
        for (int i = 0; i < arrayDigits.length; i++) {
            if (arrayDigits[i] % 2 == 0) {
                countOfEvenNumbers++;
            }
        }
        System.out.println(countOfEvenNumbers);
    }
}
