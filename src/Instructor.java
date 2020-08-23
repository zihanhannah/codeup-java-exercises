// Create an instructor class, so that we can use it for Array
//  manipulation in our 'ArraysLec' class
public class Instructor {
    private String firstName;
    private String lastName;
    private int brainWaveFrequency;
    private static int numberOfInstructors = 0;
    // TODO: 1. Create an 'Instructor' class that stores an instructor's
    //           -- firstName
    //           -- lastName
    //           -- brainWaveFrequency
    //        -- Also, keep a count of the total number of instructors

    public Instructor(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.brainWaveFrequency = 0;
        numberOfInstructors++;

//       2. Print to the console when an instructor has been created
        System.out.printf("a new instructor with first name %s, last name %s is created %n", firstName, lastName);
        System.out.printf("number of instructors is %d %n",numberOfInstructors);

    }
    //       3. Create Getters and Setters for names / brainwavefreq
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setBrainWaveFrequency(int brainWaveFrequency){
        this.brainWaveFrequency = brainWaveFrequency;
    }
    public int getBrainWaveFrequency(){
        return brainWaveFrequency;
    }

    //       4. Create a method to display instructor stats
    public String displayStats(){
        return String.format("%s, %s, brainWaveFrequency: %d", lastName, firstName, brainWaveFrequency);
    }
}
