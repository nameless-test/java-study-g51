package task3;

public class Part1 {

    public static void main(String[] args) {
        int sumOfArray = 0;
        int[] arrayDigits = {1, 2, 3, 4, 5, 131, 1212, 123, -1, -5};
        for (int i = 0; i < arrayDigits.length; i++) {
            sumOfArray += arrayDigits[i];
        }
        System.out.println(sumOfArray);
    }
}
