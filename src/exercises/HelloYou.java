package exercises;
import java.util.Scanner;

public class HelloYou {
    public static void main(String[] args) {
        String name;
        Scanner in;
        in = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = in.nextLine();
        System.out.println("Hello " + name + "!");
    }

}
