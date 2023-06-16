public class MethodsExercises {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 2;
        Addition(num1,num2);
        Subtraction(num1, num2);
        Multiplication(num1, num2);
        Division(num1, num2);
        Modulus(num1, num2);
    }
    public static void Addition(int num1, int num2){
        System.out.println(num1 + num2);
    }
    public static void Subtraction(int num1, int num2){
        System.out.println(num1 - num2);
    }
    public static void Multiplication(int num1, int num2){
        System.out.println(num1 * num2);
    }
    public static void Division(int num1, int num2){
        System.out.println(num1 / num2);
    }
    public static void Modulus(int num1, int num2){
        System.out.println(num1 % num2);
    }
}

