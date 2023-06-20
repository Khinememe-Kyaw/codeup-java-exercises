package shapes;
import java.util.Scanner;

public class CircleApp {

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("What is the radius? : ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);

        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());
    }
}
