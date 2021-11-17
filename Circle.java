public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return radius * 2.0 * Math.PI;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
