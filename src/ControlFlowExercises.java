import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){
        int i = 5;
        while( i <= 15){
            System.out.println(i);
            i++;
        }
        main1();
        doWhile1();
        forLoop1();
        doWhile2();
        forLoop2();
        doWhile3();
        forLoop3();
        FizzBuzz();
        powers();
        grades();
    }
    public static void main1(){
        for(int i = 5; i <= 15; i++){
            System.out.println(i);
        }
    }
    public static void doWhile1(){
        int j = 0;
        do{
            System.out.println(j);
            j = j + 2;
        } while( j <= 100);
    }
    public static void forLoop1(){
        for(int j = 0 ; j <= 100; j = j+2){
          System.out.println(j);
        }
    }
    public static void doWhile2() {
        int k = 100;
        do{
            System.out.println(k);
            k = k -5;
        } while(k >= -10);
    }
    public static void forLoop2(){
        for(int k = 100; k >= -10; k = k - 5){
            System.out.println(k);
        }
    }
    public static void doWhile3(){
        long l = 2;
        do{
            System.out.println(l);
            l = l * l;
        }while(l <= 65536);
    }
    public static void forLoop3(){
        for(long l = 2L; l <= 65536; l= l * l){
            System.out.println(l);
        }
    }
    public static void FizzBuzz(){
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if ( i % 3 == 0){
                System.out.println("Fizz");
            } else if ( i % 5 == 0){
                System.out.println("Buzz");
            } else{
                System.out.println(i);
            }
        }
    }
    public static void powers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("what number would you like to go up to?(integer>=1) ");
        int userInput = scanner.nextInt();
        System.out.print("You entered the number: " + userInput + ". Do you want to continue? Yes/No?");
        String argument = scanner.next();
        if(argument.equals("Yes")){
            System.out.println("Here is your table!");
            System.out.println(" number | squared |  cubed  ");
            System.out.println(" ______ | _______ |  ______ ");
            for(int i = 1; i <= userInput;i++){
                int squared = (int) Math.pow(i,2);
                int cubed = (int) Math.pow(i,3);
                System.out.printf("%-7d | %-7d | %-5d%n", i, squared, cubed);
            }
        }
    }
    public static void grades(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("The Grade Ranges:");
        System.out.println("A : 100 - 88");
        System.out.println("B : 87 - 80");
        System.out.println("C : 79 - 67");
        System.out.println("D : 66 - 60");
        System.out.println("F : 59 - 0");
        System.out.println("what's your numerical grade from 1 to 100? ");
        int grades = scanner.nextInt();
        if(grades > 88){
            if(grades > 98){
                System.out.println("You got an A+");
            } else if(grades < 90){
                System.out.println("You got an A-");
            }
            System.out.println("You got an A");
        } else if (grades > 80){
            if(grades > 85){
                System.out.println("You got a B+");
            } else if (grades < 82){
                System.out.println("You got a B-");
            }
            System.out.println("You got a B");
        } else if(grades > 67){
            if(grades > 77){
                System.out.println("You got a C+");
            } else if (grades < 69){
                System.out.println("You got a C-");
            }
            System.out.println("You got a C");
        }else if(grades > 60){
            if(grades > 64){
                System.out.println("You got a D+");
            } else if (grades < 62){
                System.out.println("You got a D-");
            }
            System.out.println("You got a D");
        } else {
            System.out.println("You got a E");
        }

    }

}



