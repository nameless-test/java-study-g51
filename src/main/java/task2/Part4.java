package task2;

import java.util.Scanner;

public class Part4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Your score (or \"q\" to exit): ");
            String input = scan.next();
            if (input.equals("q")) {
                System.out.println("Exiting...");
                break;
            }
            int userNumber = Integer.parseInt(input);
            if (userNumber >= 0 && userNumber <= 49) {
                System.out.println(userNumber + ": \"Unsatisfactory\"");
            } else if (userNumber >= 50 && userNumber <= 69) {
                System.out.println(userNumber + ": \"Satisfactory\"");
            } else if (userNumber >= 70 && userNumber <= 89) {
                System.out.println(userNumber + ": \"Good\"");
            } else if (userNumber >= 90 && userNumber <= 100) {
                System.out.println(userNumber + ": \"Excellent\"");
            } else {
                System.out.println("Incorrect input");
            }
        }
        scan.close();
    }
}
