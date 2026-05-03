package task5.Part2;

public class Truck extends Vehicle {

    private double loadCapacity;

    public Truck(String name, int speed, double loadCapacity) {
        super(name, speed);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void move() {
        System.out.println(getName() + " is moving at speed " + getSpeed() + " km/h and with " + loadCapacity + " kg load");
    }

}
