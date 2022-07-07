package Day01;

public class CalculateAreas extends Shape {
    Shape[] shapes;
    double sumTotal = 0;
    double area;
    Rectangle r;

    public CalculateAreas(Shape[] sh) {
        this.shapes = sh;
    }

    public CalculateAreas() {

    }

    public double sumAreas() {
        sumTotal = 0;
        for (int i = 0; i < shapes.length; i++) {
            sumTotal = sumTotal + shapes[i].calcArea();
        }
        return sumTotal;
    }

    public void output() {
        System.out.println("Total of all areas = " + sumTotal);
    }

    @Override
    public double calcArea() {
        area = r.length * r.width;
        return 0;
    }
}
