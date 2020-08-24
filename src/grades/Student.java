package grades;

import java.util.ArrayList;
import java.util.Scanner;

//Create a class named Student. It should have private properties for the student's name, and grades. The grades property should be an ArrayList of integers. The student class should have a constructor that sets name property, and initializes the grades property as an empty ArrayList
public class Student {
    private String name;
    private ArrayList<Integer> grades;
    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();

}
    // returns the student's name
    public String getName(){
       return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    };
    // returns the average of the students grades
    public double getGradeAverage(){
        int sum = 0;
        for(int i = 0; i < grades.size();i++){
            System.out.println(this.name + "'s grades : " + this.grades.indexOf(i));
            sum += this.grades.indexOf(i);
        }
        return sum / this.grades.size();
    };
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the name");


    }
}
