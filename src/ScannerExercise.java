////Example
//import java.util.Scanner;
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
import java.util.Scanner;
public class ScannerExercise{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

////Printing the integer
//        System.out.print("Enter the integer: ");
//        int userInput = scanner.nextInt();
//        System.out.println("You entered : --> \"" + userInput + "\" <--");
////input misMatch error when input is not number
//
////Entering three words
//        System.out.print("Enter the first word: ");
//        String input1= scanner.next();
//        System.out.print("Enter the second word: ");
//        String input2= scanner.next();
//        System.out.print("Enter the third word: ");
//        String input3= scanner.next();
//
//        System.out.println(input1);
//        System.out.println(input2);
//        System.out.println(input3);
////program will be waiting to enter more words if it is less than 3
////Program will ignore anything after 3 words, ** I was able to type couple of words after word 3 but it was under after input3 print and it was in green
//
////String with using next() and nextLine()
//        System.out.print("Enter the sentence: ");
//        String userInputStr = scanner.next();
//        System.out.println("You entered: --> \"" + userInputStr + "\" <--");
////Print only before space

//        String userInputString = scanner.nextLine();
//        System.out.println("You entered: --> \"" + userInputString + "\" <--");
        //Print the entire input

//Finding area and parameter of the room
        System.out.print("Enter the length of your room: ");
        String inputLength = scanner.next();
//        int length =Integer.parseInt(inputLength);
//        double length = Double.parseDouble(inputLength);
//        int length = scanner.nextInt();
        double length = Double.parseDouble(inputLength);

        System.out.print("Enter the width of your room: ");
        String inputWidth= scanner.next();
        double width = Double.parseDouble(inputWidth);

//        double width = scanner.nextDouble();//Double.parseDouble(inputWidth);

//        int width = scanner.nextInt();

        System.out.print("Enter the height of your room: ");
        String inputHeight= scanner.next();
        double height = Double.parseDouble(inputHeight);

//        int height = scanner.nextInt();

        double area = length * width;
        double perimeter = 2 * ( length + width );
//        int area = length * width;
//        int perimeter = 2 * (length + width);
//        int volume = length * width * height;


        System.out.println("Area of the room: " + area);
        System.out.println("Perimeter of the room: " + perimeter);

//Finding the Volume of the room
        double volume = length * width * height;
        System.out.println("Volume of the room: " + volume);

//BONUS
//        After using scanner.useDelimiter("\n");
//        scanner.next() with String was printing the entire sentence but scanner.nextLine() is only printing ""

    }
}


