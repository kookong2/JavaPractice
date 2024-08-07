package level01.basic;

public class ShapeManager {
    private Shape[] shapes = new Shape[10];
    private int index;

    public void addShape(Shape shape) {
        shapes[index++] = shape;
    }

    public void removeShape(Shape shape) {
        int foundIndex = -1;
        for (int i = 0; i < index; i++) {
            if (shapes[i].equals(shape)) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex != -1) {
            for (int i = foundIndex; i < index - 1; i++) {
                shapes[i] = shapes[i + 1];
            }
            shapes[--index] = null;
        }
    }

    public void printAllShapes() {
        for(Shape shape : shapes) {
            if(shape == null) break;
            System.out.println(shape);
        }
    }

    public double getTotalArea() {
        /* 배열에 저장 된 모든 도형의 넓이를 더해서 반환 */
        double total = 0;
        for(int i = 0; i < index; i++) {
            total += shapes[i].calculateArea();
        }
        return total;
    }

    public double getTotalPerimeter() {
        /* 배열에 저장 된 모든 도형의 둘레를 더해서 반환 */
        double total = 0;
        for(int i = 0; i < index; i++) {
            total += shapes[i].calculatePerimeter();
        }
        return total;
    }
}
