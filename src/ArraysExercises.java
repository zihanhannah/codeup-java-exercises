import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
//        Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.
        Person[] person = new Person[3];
        person[0] = new Person("Casey");
        person[1] = new Person("David");
        person[2] = new Person("Tristan");

        for( Person n: person){
            System.out.println(n.getName());//getName?
        }
        System.out.println("Add a new person");
        Person Trant = new Person("Trant");
        Person[] updatePeople = new Person[person.length+1];
        updatePeople = addPerson(person,Trant);
        System.out.println(("Printing out updated people array..."));
        for(Person n: updatePeople){
            System.out.println(n.getName());
        }
    }
//        Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.
        public static Person[] addPerson(Person[] existingPerson, Person newPeep){
            Person[] updatePeeps = Arrays.copyOf(existingPerson, existingPerson.length+1);
            updatePeeps[existingPerson.length]= newPeep;
            return updatePeeps;
        }



}
