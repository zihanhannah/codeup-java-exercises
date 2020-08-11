import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.", pi );
        Scanner scanner = new Scanner(System.in);

        scanner.useDelimiter("\n");//delimiter it by enter(start with a new line) see the three words example
//        scanner.useDelimiter("\t");//delimiter it with tab

        System.out.print("\n enter a integer:");
        int userInput = scanner.nextInt();
        System.out.println("you entered: --> \"" + userInput + "\"<--");

//Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        System.out.print("\n enter three words with space to seperate them:");
        String userInput1 = scanner.next();
        String userInput2 = scanner.next();
        String userInput3 = scanner.next();
        scanner.nextLine();
//        System.out.println("the first you entered:--> \"" + userInput1 + "\"<--");
//        System.out.println("the second you entered:--> \"" + userInput2 + "\"<--");
//        System.out.println("the third you entered:--> \"" + userInput3 + "\"<--");
        System.out.printf("the three words you entered: %s, %s, %s",userInput1, userInput2, userInput3);

//Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
        System.out.print("\n please enter a sentence: ");
        String userInput4 = scanner.nextLine();
        System.out.println("what you entered is :" + userInput4 );

//Prompt the user to enter values of length and width of a classroom at Codeup.
//Use the nextLine method to get user input and parse the resulting string to a numeric type.
        System.out.println("what's the length of Codeup Classroom in meter");
        String sLength = scanner.nextLine();
//        int length = Integer.parseInt(sLength);
        float length = Float.parseFloat(sLength);
        System.out.println("what's the width of Codeup Classroom in meter");
        String sWidth = scanner.nextLine();
//        int width = Integer.parseInt(sWidth);
        float width = Float.parseFloat(sLength);
//        int area = width * length;
        float area = width * length;
//        int perimeter = (width + length) * 2;
        float perimeter = (width + length) * 2;
        System.out.println("the area of Codeup Classroom: " + area + "sq.ft.");
        System.out.println("the perimeter of Codeup Class: " + perimeter + "feet");


    }

}
