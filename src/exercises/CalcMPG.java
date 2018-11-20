package exercises;
import java.util.Scanner;

public class CalcMPG {
    public static void main(String[] args) {
        Scanner in;
        double miles;
        double gal;
        double mpg;
        in = new Scanner(System.in);
        System.out.println("Enter the number of miles driven:");
        miles = in.nextDouble();
        System.out.println("Enter the gallons of fuel consumed:");
        gal = in.nextDouble();
        if (gal == 0) {
            System.out.println("Turns out you haven't used any fuel!");
            System.out.println("So we won't even attempt to divide by zero...");
        } else if (miles == 0 && gal > 0) {
            System.out.println("Turns out you haven't traveled!");
            System.out.println("Excessive idling can wear a gasoline engine prematurely.");
        } else {
            mpg = miles / gal;
            System.out.println("MPG: " + mpg);
        }

    }
}
