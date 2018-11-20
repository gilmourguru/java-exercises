package org.launchcode.java.demos.java4python.methods;
import java.util.Scanner;

/**
 * Created by LaunchCode
 */
public class HelloMethods {

    public static void main(String[] args) {
        Scanner in;
        String input;
        in = new Scanner(System.in);
        System.out.println("Choose a language: [fr, sp, wd, blank for english...");
        input = in.nextLine();
        String message = Message.getMessage(input);
        System.out.println(message);
    }
}
