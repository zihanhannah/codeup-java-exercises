package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
//        HashMap<String,String> students = new HashMap<>();
//        students.put("Ryan","ryanorsinger");
//        students.put("Zach","zgulde");
//        students.put("Fernando","fmendozaro");
//        students.put("Justin","jreich5");
        Student student = new Student("hannah");
        student.getGradeAverage();
    }
}
