package task3;

import java.util.Scanner;

public class Part5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arrayDigits = {1, 2, 3, 4, 4, 4, 5, 2, 2, 2, 3, 1};
        while (true) {
            System.out.print("Enter the value (or \"q\" to exit)>>> ");
            String input = scan.next();
            if (input.equals("q")) {
                System.out.println("Exiting...");
                break;
            }
            int valueOfInput = Integer.parseInt(input);
            int inputValueCounter = 0;
            for (int i = 0; i < arrayDigits.length; i++) {
                if (arrayDigits[i] == valueOfInput) {
                    inputValueCounter++;
                }
            }
            System.out.println(inputValueCounter);
        }
    }
}
