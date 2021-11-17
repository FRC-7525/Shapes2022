public class MyProgram {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        Rectangle myFirstRectangle = new Rectangle(3, 4);
        Rectangle mySecondRectangle = new Rectangle(4,5);
        shapes[0]=myFirstRectangle;
        shapes[1]=mySecondRectangle;
        shapes[2]= new Circle(3);
        shapes[3] = new Square(1);
        
        int i=0;
        for (Shape r:shapes){
            System.out.println("Shape " + i + " Perimeter" + r.getPerimeter());
            System.out.println("Shape " + i + " Area = " + r.getArea() + "\n");
            i++;
        }
    }
}
