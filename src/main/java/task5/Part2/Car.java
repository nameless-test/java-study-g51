package task5.Part2;

public class Car extends Vehicle {

    private int passengerCapacity;

    public Car(String name, int speed, int passengerCapacity) {
        super(name, speed);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void move() {
        System.out.println(getName() + " is moving at speed " + getSpeed() + " km/h, carrying" + passengerCapacity + " passengers");
    }
}
