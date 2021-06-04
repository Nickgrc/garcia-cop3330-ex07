import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nickolas Garcia
 */


public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //constant
        final double con = 0.09290304;

        System.out.print("What is the length of the room in feet?");
        String length = in.nextLine();

        System.out.print("What is the width of the room in feet?");
        String width = in.nextLine();

        //string to int
        int l = Integer.parseInt(length);
        int w = Integer.parseInt(width);
        int area = l * w;
        double meter = area * con;

        String s = String.format("%.3f", meter);


        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");
        System.out.println("The area is " + "\n" + area + " square feet" + "\n" + s + " square meters");

    }
}
