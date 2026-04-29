package task4;

public class Circle {

    private Float radius;

    public void setRadius(Float radius) {
        this.radius = radius;
    }

    public Float getRadius() {
        return radius;
    }

    public Circle (Float radius) {
        this.radius = radius;
    }

    public String getSquare () {
        Float square = this.radius * radius * 3.14f;
        return ("Circle square: " + square);
    }

    public String getLenght () {
        Float lenght = this.radius * 3.14f * 2;
        return ("Circle lenght: " + lenght);
    }

    public String getParam () {
        String square = String.valueOf(getSquare());
        String lenght = String.valueOf(getLenght());
        return (String.join(" ", square, lenght));
    }

    public static Circle[] getTestCircle() { 
    return new Circle[] {
        new Circle(3.89f),
        new Circle(21.8f),
        new Circle(14.896f)
        };
    }

    public static void main(String[] args) {
        Circle[] circles = getTestCircle();

        for (Circle c : circles) {
            System.out.println(c.getParam());
        }
    }
}
