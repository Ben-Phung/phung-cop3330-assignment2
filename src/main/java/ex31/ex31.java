/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Ben Phung
 */

package ex31;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex31
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int age = 0;
        int resting = 0;

        while (resting < 1)
        {
            try {
                System.out.print("Enter your resting heart rate in beats per minute: ");
                resting = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println( "Invalid input." );
                scan.nextLine();
            }
        }

        // Since age can't be 0 while age is less than 1
        while (age < 1)
        {
            // Try and catch to get valid inputs
            try {
                System.out.print("Enter your age in years: ");
                age = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println( "Invalid input." );
                scan.nextLine();
            }
        }


        System.out.printf( "Resting Pulse: %d \t\t Age: %d", resting, age);
        System.out.println( "\nIntensity \t\tRate" );
        for (int intensity = 55; intensity <= 95; intensity += 5)
        {
            System.out.println(intensity + "%" + "\t\t\t\t" + (int) Math.ceil(calcRate(age, resting, intensity)) + " bpm");
        }

    }
    public static double calcRate(int age, int resting, int intensity)
    {
        double rate = (((220.0 - age) - resting) * (intensity / 100.0)) + resting;
        return rate;
    }
}