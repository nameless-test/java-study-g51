package task3;

import java.util.Scanner;

public class Part7 {

    public static void main(String[] args) {
        currentDay();
    }

    public static void currentDay() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number: ");
            String input = scan.next();
            if (input.equalsIgnoreCase("q")) {
                System.out.println("Exiting...");
                break;
            }
            if (Integer.parseInt(input) == 1) {
                System.out.println("Monday");
            } else if (Integer.parseInt(input) == 2) {
                System.out.println("Tuesday");
            } else if (Integer.parseInt(input) == 3) {
                System.out.println("Wednesday");
            } else if (Integer.parseInt(input) == 4) {
                System.out.println("Thursday");
            } else if (Integer.parseInt(input) == 5) {
                System.out.println("Friday");
            } else if (Integer.parseInt(input) == 6) {
                System.out.println("Saturday");
            } else if (Integer.parseInt(input) == 7) {
                System.out.println("Sunday");
            } else {
                System.out.println("It would be better if today were Friday...");
            }
        }
    }
}
