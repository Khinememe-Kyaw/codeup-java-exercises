package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner= new Scanner(System.in);

    public static String getString(String prompt){
        System.out.print(prompt);
        return scanner.nextLine();
    }
    public static boolean yesNo(String prompt){
        String input = getString("");
        return input.equalsIgnoreCase("yes")|| input.equalsIgnoreCase("y");
    }
    public static int getInt(int min, int max, String prompt){
        int num = getInt(prompt);
        while( num<= min || num>=max){
            System.out.printf("Please enter a number between %d and %d : ", min, max, prompt);
            num =getInt(prompt);
        }
        return num;
    }
    public static int getInt(String prompt){
       return  scanner.nextInt();
    }
    public static double getDouble(double min, double max, String prompt){
        System.out.print(prompt);
        double decNum =getDouble(prompt);
        while(decNum<= min || decNum >= max){
            System.out.printf("Please enter the decimal num between %s and %s : ", min, max);
            decNum=getDouble(prompt);
        }
        return decNum;
    }
    public static double getDouble(String prompt){
        System.out.print(prompt);
        return scanner. nextDouble();
    }
//String prompt allow to display a prompt that can add more instruction
    public static void main (String[] args){
        System.out.print("Type your name: ");
        System.out.println(Input.getString("Both First and Last Name"));

        System.out.print("Would you like to continue answering questions? : ");
        System.out.println(Input.yesNo("yes/no"));

        System.out.print("Enter a number between 1 and 10 : ");
        System.out.println(Input.getInt(1,10, "Type only one number between 1 to 10"));

        System.out.println("What is your favorite number? : ");
        System.out.println(Input.getInt("Whole number"));

        System.out.println("Enter a decimal number between 0.0 to 10.0");
        System.out.println(Input.getDouble(0.0,10.0, "Decimal between 0.0 to 10.0"));

        System.out.println("What is your favorite decimal number? : ");
        System.out.println(Input.getDouble("Any Decimal"));
    }
}
