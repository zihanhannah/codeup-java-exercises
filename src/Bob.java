import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again = true;
        do {
            System.out.println("start a conversation with Bob: ");
            String conversation = scanner.nextLine();
            if (conversation.endsWith("?")) {
                System.out.println("Sure");
            } else if (conversation.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (conversation.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
            System.out.println("DM Bob again?[Y/N]: ");
            String response = scanner.nextLine();
            if (!response.trim().equalsIgnoreCase("y")) {
                again = false;
            }
        } while (again);
    }
}
