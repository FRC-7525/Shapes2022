public class MyProgram {
    public static void main(String[] args) {
        Rectangle myFirstRectangle = new Rectangle(3, 4);
        System.out.println("myFirstRectangle Perimeter = " + myFirstRectangle.getPerimeter() + "\n");

        Rectangle mySecondRectangle = new Rectangle(4,5);
        System.out.println("mySecondRectangle Perimeter = " + mySecondRectangle.getPerimeter());
        System.out.println("mySecondRectangle Area = " + mySecondRectangle.getArea() + "\n");

        Circle myFirstCircle = new Circle(3);
        System.out.println("myFirstCircle Perimeter = " + myFirstCircle.getPerimeter() );
        System.out.println("myFirstCicle Area = " + myFirstCircle.getArea());
    }
}
