package Day01;

public class Circle extends Shape {

    private double radius;

    public Circle(double r) {
        radius = r;
    }

    @Override
    public double calcArea() {
        area = 3.14 * (radius * radius);
        return area;
    }
}