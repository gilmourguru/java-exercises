package exercises;
import java.util.Scanner;

public class CalcRectArea {
    public static void main(String[] args) {
        Scanner in;
        int length;
        int width;
        int area;
        in = new Scanner(System.in);
        System.out.println("Enter the length of your rectangle:");
        length = in.nextInt();
        System.out.println("Enter the width of your rectangle:");
        width = in.nextInt();
        area = length * width;
        if (length == width) {
            System.out.println("Turns out your rectangle qualifies as a square!");
            System.out.println("The area of your " + length + " * " + width + " square is: " + area);
        } else {
            System.out.println("The area of your " + length + " * " + width + " rectangle is: " + area);
        }

    }
}
