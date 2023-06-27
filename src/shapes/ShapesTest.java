package shapes;

public class ShapesTest {
    public static void main(String[] args){
        Square square = new Square(4);
        System.out.println("Square Area : " +square.getArea());
        System.out.println("Square Perimeter : " +square.getPerimeter());

        Rectangle rectangle = new Rectangle(4,6);
        System.out.println("Rectangle Area : " +rectangle.getArea());
        System.out.println("Rectangle Perimeter : " +rectangle.getPerimeter());

    }
}
