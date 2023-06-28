package shapes;

public class ShapesTest {
    public static void main(String[] args){
//        Square square = new Square(4);
//        System.out.println("Square Area : " +square.getArea());
//        System.out.println("Square Perimeter : " +square.getPerimeter());

//        Rectangle rectangle = new Rectangle(4,6);
//        System.out.println("Rectangle Area : " +rectangle.getArea());
//        System.out.println("Rectangle Perimeter : " +rectangle.getPerimeter());

        Measurable box1 = new Rectangle(4,5);
        System.out.println("Box-1 Area : " + box1.getArea());
        System.out.println("Box-1 Perimeter : " +box1.getPerimeter());

        box1 = new Square(4);
        System.out.println("Box-1 Area : " + box1.getArea());
        System.out.println("Box-1 Perimeter : " +box1.getPerimeter());

//        Measurable box2 = new Square(5);
//        System.out.println("Box-2 Area : " + box2.getArea());
//        System.out.println("Box-2 Perimeter : " +box2.getPerimeter());


    }
}
