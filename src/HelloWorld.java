import java.util.Scanner;
import java.util.InputMismatchException;
public class HelloWorld {
    public static void main(String[] args){
        System.out.print("Hello, World");
        System.out.println(args[0]);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter something:");
//        String userInput = scanner.next();
        String userInput = scanner.nextLine();
        System.out.println(("you entered:--> \""+userInput + "\"<--"));

        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);

        String myString = "Hello, Codeup";
        System.out.println(myString);

        float myNumber = 3.14f;
//        System.out.println(myNumber);

//        myNumber = 124L;

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) "three";

//        int x = 4;
//        x = x + 5;
//        x += 5;

//        int x = 3;
//        int y = 4;
//        y *= x;

//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;
//        x /= y;
//        y -=x;

        int z = Integer.MAX_VALUE;
        System.out.print(z);




    }


}
