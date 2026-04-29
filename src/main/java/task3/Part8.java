package task3;

import java.util.Scanner;

public class Part8 {

    public static void main(String[] args) {
        installLink();
    }

    public static void installLink() {
        Scanner scan = new Scanner(System.in);
        String platform = "";
        while (true) {
            System.out.print("Enter the name: ");
            String program = scan.nextLine();
            if (program.equalsIgnoreCase("q")) {
                System.out.println("Exiting...");
                break;
            }

            switch (program) {
                case "IntelliJ IDEA":
                    System.out.print("Enter the platform: ");
                    platform = scan.nextLine();
                    switch (platform) {
                        case "Windows":
                            System.out.println("https://www.jetbrains.com/idea/download/?section=windows");
                            break;
                        case "MacOS":
                            System.out.println("https://www.jetbrains.com/idea/download/?section=mac");
                            break;
                        case "Linux":
                            System.out.println("https://www.jetbrains.com/idea/download/?section=linux");
                            break;
                        default:
                            System.out.println("Unknown platform");
                    }
                    break;
                case "Git":
                    System.out.print("Enter the platform: ");
                    platform = scan.nextLine();
                    switch (platform) {
                        case "Windows":
                            System.out.println("https://git-scm.com/install/windows");
                            break;
                        case "MacOS":
                            System.out.println("https://git-scm.com/install/mac");
                            break;
                        case "Linux":
                            System.out.println("https://git-scm.com/install/linux");
                            break;
                        default:
                            System.out.println("Unknown platform");
                    }
                    break;
                case "Java":
                    System.out.print("Enter the platform: ");
                    platform = scan.nextLine();
                    switch (platform) {
                        case "Windows":
                            System.out.println("https://www.oracle.com/java/technologies/downloads/#jdk26-windows");
                            break;
                        case "MacOS":
                            System.out.println("https://www.oracle.com/java/technologies/downloads/#jdk26-mac");
                            break;
                        case "Linux":
                            System.out.println("https://www.oracle.com/java/technologies/downloads/#jdk26-linux");
                            break;
                        default:
                            System.out.println("Unknown platform");
                    }
                    break;
                default:
                    System.out.println("Unknown program");
            }
        }
    }
}
