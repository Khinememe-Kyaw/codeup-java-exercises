//import java.util.Scanner;
//
//public class Bob {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String BobAnswer;
//        boolean moreQuestion;
//
//        do {
//            System.out.print("Ask a question to Bob: ");
//            String input = scanner.nextLine();
//            if (input.endsWith("?")) {
//                BobAnswer = "Sure";
//            } else if (input.endsWith("!")) {
//                BobAnswer = "Whoa, chill out!";
//            } else if (input.isEmpty()) {
//                BobAnswer = "Fine. Be that way!";
//            } else {
//                BobAnswer = "Whatever";
//            }
//            System.out.println(BobAnswer);
//            System.out.print("Continue talking to Bob? (y/n): ");
//            String userInput = scanner.nextLine();
//            moreQuestion= userInput.equals("y");
//        }while(moreQuestion);
//    }
//}

import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bobAnswer;
        boolean moreQuestion;

        do {
            System.out.print("Ask a question to Bob: ");
            String input = scanner.nextLine();
            System.out.println("input len=" + input.length());

            if (input.length() == 0) {
                bobAnswer = "Fine. Be that way!";
            } else {
                Character lastChar = input.charAt(input.length() - 1);
                switch (lastChar) {
                    case '?':
                        bobAnswer = "Sure";
                        break;
                    case '!':
                        bobAnswer = "Whoa, chill out!";
                        break;
                    default:
                        bobAnswer = "Whatever";
                }
            }


            System.out.println(bobAnswer);
            System.out.print("Continue talking to Bob? (y/n): ");
            String userInput = scanner.nextLine();
            moreQuestion= userInput.equals("y");
        } while (moreQuestion);
    }
}

