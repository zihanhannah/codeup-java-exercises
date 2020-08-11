import java.util.Arrays;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class StringExercise {
    public static void main(String[] args) {
//        String myString = " CaseyFriday Codeup Instructor day!";
//        char capitalSee = myString.charAt(12);
//        System.out.print(capitalSee);
//        int codeupIndex = myString.indexOf("Codeup");
//        System.out.println(codeupIndex);//index of the first char
//        System.out.println("the character at CodeupIndex is " + myString.charAt(codeupIndex));
//        int lastDay = myString.lastIndexOf("day");//count from end to beginning
//        int firstDay = myString.indexOf("day");
//        System.out.println(lastDay);
//        System.out.println(firstDay);
//        int stringLength = myString.length();
//        System.out.println("the fifth from last character is: " + myString.charAt(stringLength-5));
//        System.out.println(stringLength);
//        char[] lastFive = new char[5];
//        for(int i = 0; i < 5; i++){
//            lastFive[i]=myString.charAt(stringLength-5+i);
//        }
////        System.out.println("the length of myString is " + Arrays.toString(lastFive));
//        String convert = new String(lastFive);
//        System.out.println(convert);
//        String replaceString = myString.replace("d","@");
//        System.out.println(replaceString);
//
//        int firstA = myString.indexOf("a");
//        String beforeA = myString.substring(0,firstA);
//        String afterA = myString.substring(firstA + 1, stringLength);
//        String awesomeness = beforeA + "#"+ afterA;
//        System.out.println(awesomeness);
//        System.out.println(myString.toLowerCase());
//        System.out.println(myString.toUpperCase());
//        System.out.println(myString.trim());//take off the front and end space
//        System.out.println(Arrays.toString(myString.split(" ")));
        String message = "We don't need no education\nWe don't need no thought control";
        System.out.println(message) ;
        message = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(message);
        message = "In windows, the main drive is usually C:\\";
        System.out.println(message);
        message = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!";
        System.out.println(message);

    }

}
