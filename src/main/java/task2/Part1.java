package task2;

import java.util.Scanner;

public class Part1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number: (or \"q\" to exit)");
            String input = scan.next();
            if (input.equals("q")) {
                System.out.println("Exiting...");
                break;
            }
            int userNumber = Integer.parseInt(input);
            if (userNumber == 0) {
                System.out.println("Exiting...");
                break;
            } else if (userNumber % 2 == 0) {
                System.out.println(userNumber + " is even number");
            } else {
                System.out.println(userNumber + " is odd number");
            }
        }
        scan.close();
    }
}
