package task4;

import java.util.Scanner;

public class Team {

    private Student[] listOfStudents = Student.getTestStudents();

    public Student[] getListOfStudents() {
        return listOfStudents;
    }

    public Team(Student[] listOfStudents) {
        this.listOfStudents = listOfStudents;
    }
    
    public Student [] addMember (String name, String surname, int age) {
        Student[] newArray = new Student[this.listOfStudents.length + 1];
        for (int i = 0; i < this.listOfStudents.length; i++) {
            newArray[i] = this.listOfStudents[i];
        }
        newArray[newArray.length - 1] = new Student(name, surname, age);
        this.listOfStudents = newArray;
        System.out.println(this.listOfStudents[this.listOfStudents.length-1] + " successfully added");
        return this.listOfStudents;
    }

    public void showMembers () {
        for (Student e : this.listOfStudents) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Team myTeam = new Team(Student.getTestStudents());
        Scanner scan = new Scanner(System.in);
        while (true) { 
            System.out.println("Press: ");
            System.out.println("1 - for add a new member");
            System.out.println("2 - for show current list of members");
            System.out.println("0 - for exit");
            int userInput = scan.nextInt();
            scan.nextLine();
            if (userInput == 1) {
                System.out.println("Enter the name");
                String name = scan.nextLine();
                System.out.println("Enter the surname");
                String surname = scan.nextLine();
                System.out.println("Enter the age");
                int age = scan.nextInt();
                scan.nextLine();
                myTeam.addMember(name, surname, age);
            }
            else if (userInput == 2) {
                myTeam.showMembers();
            }
            else if (userInput == 0) {
                break;
            }
        }
    }
}

