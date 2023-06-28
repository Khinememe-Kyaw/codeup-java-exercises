package grades;

import java.util.*;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
//Added name, grades and username to HashMap
        Student student_1 = new Student("Khinememe");
        student_1.addGrades(96);
        student_1.addGrades(79);
        student_1.addGrades(92);
        students.put("khinememe-kyaw", student_1);

        Student student_2 = new Student("Christine");
        student_2.addGrades(89);
        student_2.addGrades(78);
        student_2.addGrades(39);
        students.put("christine-Joan", student_2);

        Student student_3 = new Student("Jacky");
        student_3.addGrades(95);
        student_3.addGrades(100);
        student_3.addGrades(99);
        students.put("jacky-green", student_3);

        Student student_4 = new Student("Chris");
        student_4.addGrades(80);
        student_4.addGrades(94);
        student_4.addGrades(93);
        students.put("Chris-Donald", student_4);

        Student student_5 = new Student("Paula");
        student_5.addGrades(90);
        student_5.addGrades(79);
        student_5.addGrades(68);
        students.put("paula-jackson", student_5);

        System.out.println("Welcome!\n");
        System.out.println("Here are the GitHub usernames of our students:\n");
// Print all the usernames
        for (String username : students.keySet()) {
            System.out.print("|" + username + "| ");
        }
// Print all teh student names
        for (Student studentName : students.values()) {
            System.out.print("|" + studentName.getName() + "| ");
        }
        Scanner scanner = new Scanner(System.in);
        String userInput;
        do {
            System.out.print("\n\nWhat student would you like to see more information on?\n> ");
                userInput = scanner.nextLine();
                if (students.containsKey(userInput)) {
                    Student student = students.get(userInput);
                    System.out.println("\nName: " + student.getName() + " - GitHub Username: " + userInput);
                    System.out.println("Current Average: " + student.getGradeAverage());
                } else {
                    System.out.println("\nSorry, no student found with the GitHub username of \"" + userInput + "\".");
                }
            System.out.print("\nWould you like to see another student?\n> ");
            userInput = scanner.nextLine();
        }
                while(userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")|| userInput.equalsIgnoreCase("ok"));
                System.out.println("\nGoodbye, and have a wonderful day!");
            }
        }




