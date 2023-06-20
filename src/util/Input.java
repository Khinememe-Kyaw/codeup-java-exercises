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
    public static int getInt(int min, int max){
        int num = getInt();
        while( num<= min || num>=max){
            System.out.printf("Please enter a number between %d and %d : ", min, max);
            num =getInt();
        }
        return num;
    }
    public static int getInt(){
       return  scanner.nextInt();
    }
    public static double getDouble(double min, double max){
        double decNum =getDouble();
        while(decNum<= min || decNum >= max){
            System.out.printf("Please enter the decimal num between %s and %s : ", min, max);
            decNum=getDouble();
        }
        return decNum;
    }
    public static double getDouble(){
        return scanner. nextDouble();
    }

    public static void main (String[] args){
        System.out.print("Type your first and last name: ");
        System.out.println(Input.getString());
        System.out.print("Would you like to continue answering questions? : ");
        System.out.println(Input.yesNo());
        System.out.print("Enter a number between 1 and 10 : ");
        System.out.println(Input.getInt(1,10));
        System.out.println("What is your favorite number? : ");
        System.out.println(Input.getInt());
        System.out.println("Enter a decimal number between 0.0 to 10.0");
        System.out.println(Input.getDouble(0.0,10.0));
        System.out.println("What is your favorite decimal number? : ");
        System.out.println(Input.getDouble());

    }


}
