package shapes;
import util.Input;

import java.util.Scanner;

public class CircleApp {
    static int totalCircle =0;

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        boolean nextCircle=true;
        while (nextCircle){
            System.out.println("What is the radius? : ");
            double radius = scanner.nextDouble();
            Circle circle = new Circle(radius);
            Input input = new Input();

            System.out.println(circle.getArea());
            System.out.println(circle.getCircumference());
//            Asking user if they want to make more circle
            System.out.println("Would you like to create another circle?");
            scanner.nextLine();
            nextCircle= input.yesNo("");
            totalCircle++;
            System.out.println("Total circles you made was : " + getTotalCircle());

        }
    }

    public static int getTotalCircle() {
        return totalCircle;
    }
}
