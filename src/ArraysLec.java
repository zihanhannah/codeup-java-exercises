import java.util.Arrays;
import java.util.Random;

public class ArraysLec {
    public static void main(String[] args) {
        /* ***************   ******** ********************* */
        /* ******** WORKING WITH ARRAY ELEMENTS *********** */
        /* ************* ITERATING ARRAYS ***************** */
        /* ***************   ******** ********************* */

        // TODO: 1. Declare an int array called numbers without populating it
        //       2. Declare a String array called words with a length of 10
        //       3. Initialize an int array called temps with the 'array initializer syntax'
        int[] numbers;
        String[] words = new String[10];
        int[] temps = {34,56,36,76,94};

        // TODO: 1. Using a for loop, iterate through the temps array and print each temp on a new line
        //       2. Using an advanced for, iterate through the temps array and print each temp on a new line
        //       3. Re-assign the third element with a temp of 38
        //       4. Print "Updated third temp: 38" to the console, using printf
        int sum = 0;
        for(int temp : temps){
            System.out.println(temp);
            sum += temp;
        }
        System.out.println(sum);
        for(int i = 0; i < temps.length; i++){
            if(i == 2){
                temps[2]= 38;
            }
            System.out.println(temps[i]);
        }

        // TODO: 1. Create a string array called 'horns', populated with 4 values, using array initializer syntax
        //       2. Print a random element to the screen, saying "_random_ is the best manufacturer!"

        String[] horns = {"Yamaha","Conn","Schmid","Holton"};

        //get the random number!!
//        int randomNumber = (int)(Math.random() * (5));
//        int random_int = (int)(Math.random() * (max - min + 1) + min);
        Random random = new Random();
        int randomNumber = random.nextInt(4);
        System.out.println(horns[randomNumber] + "is the best manufacturer!");

        System.out.println(Arrays.toString(horns));

        /* ***************   ******** ********************* */
        /* ********* **** THE ARRAYS CLASS **** *********** */
        /* **************** 2D ARRAYS ********************* */
        /* ***************   ******** ********************* */
        // TODO:
        //       5. Initialize an array full of instructor objects// check the instructor.java

        final int totalNumberOfInstructors = 3;
        Instructor[] instructors = new Instructor[totalNumberOfInstructors];

 //       6. Instantiate three instructors (casey,david,tristan)

        Instructor casey = new Instructor("Casey","Friday");
        Instructor tristan = new Instructor("Tristan","Crawford");
        Instructor david = new Instructor("David","Stephens");

 //       7. Set each instructor's BrainWaveFrequency
        casey.setBrainWaveFrequency(50);
        tristan.setBrainWaveFrequency(5000);
        david.setBrainWaveFrequency(500);

//       8. Add those instructors in the Instructor object array
        instructors[0] =  casey;
        instructors[1] = tristan;
        instructors[2] = david;

//       9. Iterate through the Instructor object array, and display each instructor's stats
        for(Instructor instructor: instructors){
            System.out.println(instructor.displayStats());
        }
        for(int i = 0; i < totalNumberOfInstructors;i++){
            System.out.println(instructors[i].displayStats());
        }
//       10. Create an array with only first names in it, and display it to the console
        String[] firstNames = new String[3];
        for(int i = 0; i < 3; i++){
            firstNames[i] = instructors[i].getFirstName();
            System.out.println(firstNames[i]);
        }
//       11. Sum the brainwave frequencies, and display the total to the console
        int sum1 = 0;
        for(int i = 0; i< 3; i++){
            sum1 += instructors[i].getBrainWaveFrequency();
        }
        System.out.println(sum1);
//
        Instructor[] instructor2 = Arrays.copyOf(instructors,4);
        instructor2[3] = new Instructor("Hung","Ly");
        instructor2[3].setBrainWaveFrequency(5);
        for(int i = 0; i <4;i++){
            System.out.println(instructor2[i].displayStats());
        }
//        12. Create a 2D array, and print it to the console, in grid form
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for(int[] row : matrix){
            System.out.println("+---+---+---+");
            System.out.print("|");
            for(int n : row){
                System.out.print( " "+ n + " |");
            }
            System.out.println();
        }
        System.out.println("+---+---+---+");
    }

}
