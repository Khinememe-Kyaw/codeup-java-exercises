import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
////        While loop
//        int i=5;
//        while(i<=15){
//            System.out.println(i++);
//        }

////        Do While loop
//        int i=0;
//        do{
//            System.out.println(i);
//            i+=2;
//        }while(i <=100);

//        int i=100;
//        do{
//            System.out.println(i);
//            i-=5;
//        }while(i >= -5);
//        long i=2;
//        do{
//            System.out.println(i);
//            i*=i;
//        }while(i <1000000);
        for(int i=5; i<=15; i++){
            System.out.println(i);
        }
        for(int i=0; i<=100; i+=2){
            System.out.println(i);
        }
        for (int i=100; i>= -5;i-=5){
            System.out.println(i);
        }
        for(long i=2; i<1000000; i=i*i){
            System.out.println(i);
        }
        for(int i=0; i<=100; i++){
            if(i%3==0 & i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i!=0 && i%3==0){
                System.out.println("Fizz");
            }
            else if(i!=0 && i%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
        System.out.print("What number would you like to go up to? ");
        int num = scanner.nextInt();
        System.out.println("Here is your table!");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");

        for(int i=1; i<= num ;i++){
            int squared = i*i;
            int cubed = i*i*i;
            System.out.printf("%-6d | %-7d | %d%n", i, squared, cubed);
        }

//        David's Answer
        boolean WantsToContinue;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("What number would you like to go up to? ");
            int Num = scanner.nextInt();
            System.out.println("Here is your table! \n number | squared | cubed \n ------ | ------- | -----");
            for(int i=1; i<= Num ;i++){
                System.out.printf("%-6d | %-7d | %d%n", i, i*i, i*i*i);
            }
            System.out.println("Would you like to enter another number?(y/n)");
//            scan.nextLine();
            String UserAns= scan.nextLine();
            WantsToContinue= UserAns.equals("y");
        }while(WantsToContinue);


        String option;
        do {System.out.print("Type the number between 0 to 100 :  ");
            int Input = scanner.nextInt();
            String Grade;
            if (Input >= 97 && Input <= 100) {
                Grade = "A+";
            } else if (Input >= 93 && Input <= 96) {
                Grade = "A";
            } else if (Input >= 90 && Input <= 92) {
                Grade = "A-";
            } else if (Input >= 87 && Input <= 89) {
                Grade = "B+";
            } else if (Input >= 83 && Input <= 86) {
                Grade = "B";
            } else if (Input >= 80 && Input <= 82) {
                Grade = "B-";
            } else if (Input >= 77 && Input <= 79) {
                Grade = "C+";
            } else if (Input >= 73 && Input <= 76) {
                Grade = "C";
            } else if (Input >= 70 && Input <= 72) {
                Grade = "C-";
            } else if (Input >= 67 && Input <= 69) {
                Grade = "D+";
            } else if (Input >= 65 && Input <= 66) {
                Grade = "D";
            } else {
                Grade = "F";
            }
            System.out.println("Your grade is: " + Grade);
            System.out.print("Do you want to continue? (y/n): ");
            option = scanner.next();
        }while(option.equals(("y")));

    }
}



