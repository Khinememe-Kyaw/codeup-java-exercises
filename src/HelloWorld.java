public class HelloWorld {
    public static void main(String[] args){
        System.out.print("Hello");
        System.out.println("World");

        int myFavoriteNumber;
        myFavoriteNumber =22;
        System.out.println(myFavoriteNumber);

        String myString;
        myString = "My name is Khinememe";
        System.out.println(myString);
//        incompatible types: double cannot be converted to java.lang.String (changing to 3.14)

        float myNumber;
//        myNumber = 3.14f;
          myNumber = (float)3.14;
        System.out.println(myNumber);
//        variable myNumber might not have been initialized (when print myNumber without assigning)
//        incompatible types: possible lossy conversion from double to long (when myNumber is assigned to 3.14)
//          eventhough myNumber was assigned to 123L, it only printed 123 (only print the number);
//        it prints 123 without any error ( assume it printed only number, not decimal, not alphabet)
//        3.14 is decimal and 123 is absolute number

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//        It prints out as 5 and 6 because x has double plus sign after that so java will print x before doing calculation

        int j = 5;
        System.out.println(++j);
        System.out.println(j);
//        It prints out as 6 and 6 because x has double plus sign before so java will print x after doing calculation

//        class myName{
//
//        }
//       wasn't able to assign with ; gave me error saying it goes { after

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//          ClassCastException: String cannot be cast to class

//        int three = (int) "three";
//        incompatible types: java.lang.String cannot be converted to int

//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//
//        System.out.println(y);


        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);

//        int num;
//        num = 2147483648;
//        it gives the error integer number is too large

        int num;
//        num = Integer.MAX_VALUE;
//        num++;
//        System.out.println(num);
//        print -2147483647

        num= Integer.MIN_VALUE;
        num--;
        System.out.println(num);
//        print 2147483647

    }
}

