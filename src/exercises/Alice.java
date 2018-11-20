package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[]args) {
        String refText = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures " +
                "or conversation?'";
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a search term:");
        String term = in.nextLine();
        if (refText.toLowerCase().contains(term.toLowerCase())) {
            //System.out.println("True: Hooray! I found '" + term + "' in the searched text.");
            System.out.println("true");
        } else {
            //System.out.println("False: Sorry, I could NOT find '" + term + "' in the searched text. Please try another term.");
            System.out.println("false");
        }
    }
}
