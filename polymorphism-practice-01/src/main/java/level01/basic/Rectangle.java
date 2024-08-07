package level01.basic;

public class Rectangle extends Shape implements Resizable{

    private double width;
    private double height;

    @Override
    public void resize(double factor) {
        width = factor * width;
        height = factor * height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }

    @Override
    double calculatePerimeter() {
        return 2 * width + 2 * height;
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Shape : Rectangle \n" +
                "Area : " + calculateArea() + "\n" +
                "Perimeter : " + calculatePerimeter();
    }
}
