package task2;

import java.util.Scanner;

public class Part3 {

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
                System.out.println(userNumber + " is zero");
            } else if (userNumber < 0) {
                System.out.println(userNumber + " is negative number");
            } else {
                System.out.println(userNumber + " is positive number");
            }
        }
        scan.close();
    }
}
