import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {

        Bob();
    }
        public static void Bob(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("start a conversation with Bob: ");
            String conversation = scanner.nextLine();
            if(conversation.endsWith("?")){
                System.out.println("Sure");
            } else if(conversation.endsWith("!")){
                System.out.println("Whoa, chill out!");
            } else if(conversation.equals("")){
                System.out.println("Fine. Be that way!");
            } else{
                System.out.println("Whatever.");
            }
    }
}
