package grades;

public class StudentTest {
    public static void main(String[] args){
        Student student = new Student("Khinememe");

        student.addGrades(89);
        student.addGrades(98);
        student.addGrades(100);
        student.addGrades(99);
        student.addGrades(75);
        student.addGrades(78);


        System.out.printf("Student Grade Avg is: %.2f%n", student.getGradeAverage());

    }
}
