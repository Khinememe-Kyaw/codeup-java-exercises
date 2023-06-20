import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args){
        System.out.println(Addition(10,8));
        System.out.println(Subtraction(10,3));
        System.out.println(Multiplication(3,6));
        System.out.println(Division(18,3));
        System.out.println(Modulus(19,2));
//        System.out.println(division(18,0)); //Exception in thread "main" java.lang.ArithmeticException: / by zero
        System.out.println(multiplication(2,-3));
        int Num = getInteger(1,10);
//        int factorialNum = factorial(1,10);
    }
//    public static void Addition(int num1, int num2){
//        System.out.println(num1 + num2);
//    }
//    public static void Subtraction(int num1, int num2){
//        System.out.println(num1 - num2);
//    }
//    public static void Multiplication(int num1, int num2){
//        System.out.println(num1 * num2);
//    }
//    public static void Division(int num1, int num2){
//        System.out.println(num1 / num2);
//    }
//    public static void Modulus(int num1, int num2){
//        System.out.println(num1 % num2);
//    }
    public static int Addition(int num1, int num2){
        return(num1 + num2);
    }
    public static int Subtraction(int num1, int num2){
        return(num1 - num2);
    }
    public static int Multiplication(int num1, int num2){
        return(num1 * num2);
    }
    public static int Division(int num1, int num2){
        return(num1 / num2);
    }
    public static int Modulus(int num1, int num2)
    {
        return(num1 % num2);
    }
    public static int division(int num1, int num2){
        return num1/num2;
    }
    public static int multiplication (int num1, int num2){
        int result =0;
        boolean isNeg =false;
        if(num1<0 && num2<0){
            num1= -num1;
            num2= -num2;
        }else if(num1<0 || num2<0){
            isNeg= true;
            if(num1<0){
                num1= -num1;
            }else{
                num2= -num2;
            }
        }
        for (int i=0; i<num2; i++){
            result += num1;
        }
        if(isNeg=true){
            result= -result;
        }else{
            result= result;
        }
        return result;
    }
    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();
        if(userInput>=min & userInput<=max){
            System.out.println("Valid!");
            return userInput;
        }else{
//            System.out.print("Enter a number between 1 and 10: ");
            // Recursive call to get the input again
            return getInteger(min, max);
        }
    }
//    public static int factorial(int min, int max){
//        Scanner scan = new Scanner(System.in);
//        long factor;
//        do{System.out.print("Enter a number between 1 to 10 for factorial: ");
//            int input =scan.nextInt();
//            if(input >=min & input<=max){
//                if(input==1){
//                    factor =1;
//                }else{
//                for(int i =2; i<=input; i++ ) {
//                    factor *= i;
//                }}
//
//            }
//        } while(input < max);
//    }
}

//Display the factorial of the number entered by the user.
//Ask if the user wants to continue.
//Use a for loop to calculate the factorial.
//Assume that the user will enter an integer, but verify it’s between 1 and 10.
//Use the long type to store the factorial.
//Continue only if the user agrees to.
//A factorial is a number multiplied by each of the numbers before it.
//Factorials are denoted by the exclamation point (n!). Ex: