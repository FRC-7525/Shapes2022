public class MyProgram {
    public static void main(String[] args) {
        Rectangle myFirstRectangle = new Rectangle(3, 4);
        System.out.println("myFirstRectangle Perimeter = " + myFirstRectangle.getPerimeter());

        Rectangle mySecondRectangle = new Rectangle(4,5);
        System.out.println("mySecondRectangle Perimeter = " + mySecondRectangle.getPerimeter());
        System.out.println("mySecondRectangle Area = " + mySecondRectangle.getArea());
    }
}
