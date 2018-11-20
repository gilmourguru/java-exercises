package org.launchcode.java.demos.java4python.methods;

/**
 * Created by LaunchCode
 */
public class Message {

    public static String getMessage(String lang) {

        if (lang.equals("sp")) {
            return "Hola Mundo";
        } else if (lang.equals("fr")) {
            return "Bonjour le monde";
        } else if (lang.equals("wd")) {
            return "flakdj8fds fadsads8fdjksh";
        } else {
            return "Hello World";
        }
    }
}
