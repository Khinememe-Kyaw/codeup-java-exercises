package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
//    constructor
    public Student(String name ){
        this.name =name;
        this.grades =new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name= name;
    }
    public ArrayList<Integer> getGrades(){
        return grades;
    }
    public void addGrades(int grade){
        grades.add(grade);
    }
    public double getGradeAverage(){
        int sum =0;
        for (int grade: grades){
            sum+=grade;
        }
        return (double) sum/grades.size();
    }

}
