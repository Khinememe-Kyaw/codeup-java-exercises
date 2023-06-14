////Example
import java.util.Scanner;
//
//public class ScannerExample {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter something: ");
//
////        String userInput = scanner.next();
////        System.out.println("You entered: --> \"" + userInput + "\" <--");
////        Print only before space
//
//        String userInput = scanner.nextLine();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//        //        Print the entire input
//    }
//}

public class ScannerExercise{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int userInput = scanner.nextInt();
        System.out.println("You entered : --> \"" + userInput + "\" <--");
//        input misMatch error when input is not number

    }
}

