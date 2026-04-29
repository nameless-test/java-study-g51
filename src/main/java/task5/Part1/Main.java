package task5.Part1;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Dog dog = new Dog();
        Fish fish = new Fish();

        animal.eat();
        animal.sleep();

        System.out.println("\nBird says:");
        bird.fly();
        bird.sleep();
        bird.eat();

        System.out.println("\nDog says:");
        dog.bark();
        dog.eat();
        dog.sleep();

        System.out.println("\nFish says:");
        fish.swim();
        fish.eat();
        fish.sleep();
    }
}
