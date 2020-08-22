package util;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public void clear() {
        scanner.nextLine();
    }

    public String getString() {
        System.out.println("input String: ");
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Yes or No?");
        String input = getString().toLowerCase();
        switch (input) {
            case "y":
            case "yes":
            case "yeah":
                return true;
            case "n":
            case "no":
            case "na":
                return false;
            default:
                return yesNo();
        }

    }

    public int getInt(int min, int max) {
        int input;
        do {
            System.out.println("enter a number between" + min + " and " + max + ": ");
            input = scanner.nextInt();
            if (input < min || input > max) {
                System.out.println("input invalid");
            }
        }while (input < min || input > max) ;
        System.out.println("input acceptable");
        return input;

    }

    public int getInt(){
        System.out.println("enter a number");
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double input;

        do {
            System.out.println("enter a number between" + min + " and " + max + ": ");
            input = scanner.nextDouble();
            if (input < min || input > max) {
                System.out.println("input invalid");
            }
        }while (input < min || input > max) ;
        System.out.println("input acceptable");
        return input;

    }
    public double getDouble(){
        System.out.println("enter a number");
        return scanner.nextDouble();
    }


}




