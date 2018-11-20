package org.launchcode.java.studios;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        double area;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of your circle:");
        radius = in.nextDouble();
        while (radius < 0) {
            System.out.println("Please enter your radius as a positive number:");
            radius = in.nextDouble();
        }
        area = Math.PI * radius * radius;
        System.out.println("Area = " + area);
    }
}
