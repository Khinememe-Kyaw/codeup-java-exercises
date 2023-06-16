public class MethodsExercises {
    public static void main(String[] args){
        Addition(10,8);
        Subtraction(10,3);
        Multiplication(3,6);
        Division(18,3);
        Modulus(19,2);
//        System.out.println(division(18,0)); //Exception in thread "main" java.lang.ArithmeticException: / by zero
        System.out.println(multiplication(2,-3));
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
}

