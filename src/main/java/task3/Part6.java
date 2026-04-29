package task3;

import java.util.Scanner;

public class Part6 {

    public static void main(String[] args) {
        checkTriangle();
    }

    public static void checkTriangle() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Enter 3 side lengths (or enter 'q' to exit): ");
            String input = scan.next();
            if (input.equalsIgnoreCase("q")) {
                System.out.println("Exiting...");
                break;
            }
            int a = Integer.parseInt(input);
            int b = scan.nextInt();
            int c = scan.nextInt();
            if (a < 0 || b < 0 || c < 0) {
                System.out.println("All sides must be greater than 0");
            } else if (a + b > c && a + c > b && b + c > a) {
                System.out.println("You can build a triangle with sides [" + a + ", " + b + ", " + c + "]");
            } else {
                System.out.println("You cannot build a triangle with sides [" + a + ", " + b + ", " + c + "]");
            }
        }
    }
}
