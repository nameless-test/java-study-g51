package task2;

import java.util.Scanner;

public class Part6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number (or \"q\" to exit): ");
            String input = scan.next();
            if (input.equals("q")) {
                System.out.println("Exiting...");
                break;
            }
            int totalSum = 0;
            int userNumber = Integer.parseInt(input);
            for (int n = 1; n <= userNumber; n++) {
                totalSum = totalSum + n;
            }
            System.out.println("Sum = " + totalSum);
        }
        scan.close();
    }
}
