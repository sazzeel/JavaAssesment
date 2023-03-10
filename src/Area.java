import static java.lang.Math.*;

public class Area extends Shape{

    @Override
    public void RectangleArea(double length, double width) {
        System.out.printf("Rectangle area = %.2f", length *width);
        System.out.println("");
    }

    @Override
    public void SquareArea(double side) {
        System.out.printf("Square area = %.2f", pow(side,2));
        System.out.println("");
    }

    @Override
    public void CircleArea(double radius) {
        System.out.printf("Circle area = %.2f", PI*pow(radius, 2));
        System.out.println("");
    }
}