package task2;

import java.util.Scanner;

public class Part2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Enter first number: (or \"q\" to exit)");
            String input = scan.next();
            System.out.print("Enter second number: ");
            if (input.equals("q")) {
                System.out.println("Exiting...");
                break;
            }
            int firstNumber = Integer.parseInt(input);
            int secondNumber = scan.nextInt();
            if (firstNumber == secondNumber) {
                System.out.println(firstNumber + " and " + secondNumber + " are equal");
            } else if (firstNumber < secondNumber) {
                System.out.println("Number " + secondNumber + " is greater than " + firstNumber);
            } else {
                System.out.println("Number " + firstNumber + " is greater than " + secondNumber);
            }
        }
        scan.close();
    }
}
