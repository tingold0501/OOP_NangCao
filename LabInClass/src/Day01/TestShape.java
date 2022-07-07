package Day01;

public class TestShape {
    public static void main(String[] args) {
        System.out.println("Hello Word!");
        Circle circle = new Circle(1);
        Shape[] shapes = new Shape[1];
        shapes[0] = circle;

        CalculateAreas ca = new CalculateAreas(shapes);

        ca.sumAreas();
        ca.output();
    }
}
