package task4;

public class Student {

    private String name;
    private String surname;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getFullName() {
        String fullName = String.join(" ", "Student's full name:", this.name, this.surname);
        return fullName;
    }

    public static Student[] getTestStudents() { 
    return new Student[] {
        new Student("Andrii", "Poplavok", 20),
        new Student("Ivan", "Richka", 26),
        new Student("Petro", "Koval", 40),
        new Student("Bohdan", "Koval", 18),
        new Student("Mykola", "Viter", 32)
        };
    }
    
    @Override
    public String toString() {
        return "Student [name=" + name + ", surname=" + surname + ", age=" + age + "]";
    }

    public static void main(String[] args) {
        Student[] students = getTestStudents();
        for (Student e : students) {
            System.out.println(e);
        }
    }
}
