import java.util.Arrays;

public class ServerNameGenerator {
//    Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
    String[] adjectives = {"beautiful","cute","wonderful","awesome","pretty","excellent","perfect","comely","fair","smart"};
    String[] nouns = {"beauty","fairness","loveliness","wisdom","intelligence","wit","effort","workout","job","love"};
//    Create a method that will return a random element from an array of strings
    public static String randomElement(String[] inputArray){
        int random = (int)(Math.random() * (10) );
        return inputArray[random];
    }
//    Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
    public static void main(String[] args) {
        ServerNameGenerator generateName = new ServerNameGenerator();
        System.out.println("Here is your server name: ");
        System.out.println(randomElement(generateName.adjectives) + "-" + randomElement(generateName.nouns) );
    }
}
