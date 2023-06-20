package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner= new Scanner(System.in);

    public static String getString(){
        return scanner.nextLine();
    }
    public static boolean yesNo(){
        String input = getString();
        return input.equalsIgnoreCase("yes")|| input.equalsIgnoreCase("y");
    }
//    public static int getInt(int min, int max){
//        int min = scanner.nextInt();
//        int max = scanner.nextInt();
//
//        return min;
//    }
    public static int getInt(){
       return  scanner.nextInt();
    }
//    public static double getDouble(double min, double max){
//        return
//    }
//    public static double getDouble(){
//        return
//    }

    public static void main (String[] args){
        System.out.print("Type your first and last name: ");
        System.out.println(Input.getString());
        System.out.print("Would you like to continue answering questions? : ");
        System.out.println(Input.yesNo());
//        System.out.print("Type maximum no");
//        System.out.println(Input.getInt(min,max));
        System.out.println("What is your favorite number? : ");
        System.out.println(Input.getInt());
    }
}
