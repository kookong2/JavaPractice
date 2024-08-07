package level01.basic;

public class Circle extends Shape implements Resizable{

    private double radius;

    @Override
    public void resize(double factor) {
        radius = radius * factor;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Shape : Circle \n" +
                "Area : " + calculateArea() + "\n" +
                "Perimeter : " + calculatePerimeter();
    }
}
