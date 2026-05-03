package task5.Part2;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Bike", 120);
        Truck truck = new Truck("Pickup", 60, 500);
        Car car = new Car("Nissan", 100, 4);

        vehicle.move();
        vehicle.stop();

        truck.move();
        truck.stop();

        car.move();
        car.stop();
    }
}
