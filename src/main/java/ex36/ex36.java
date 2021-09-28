/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Ben Phung
 */

package ex36;

import java.util.ArrayList;
import java.util.Scanner;

public class ex36
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        String names = "";
        // Create array list of numbers
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        // Loop until user inputs done using do while
        do
        {
            System.out.print( "Enter a number: " );
            names = scan.nextLine();

            if(!names.equals("done"))
            {
                int iNames = Integer.parseInt(names);
                numbers.add(iNames);
            }
        }while(!names.equals("done"));

        System.out.print( "Numbers: " );
        for (int i=0; i<numbers.size(); i++)
        {
            System.out.print(numbers.get(i) + ", ");
        }

        System.out.printf( "\nThe average is %.1f\nThe minimum is %d\nThe maximum is %d\nThe standard deviation is %.2f"
                , average(numbers), min(numbers), max(numbers), std(numbers, average(numbers)));
    }

    public static double average(ArrayList<Integer> numbers)
    {
        int sum = 0;
        double average;

        for (int i = 0; i < numbers.size(); i++)
        {
            sum += numbers.get(i);
        }

        average = sum * 1.0 / numbers.size();

        return average;
    }

    public static int max(ArrayList<Integer> numbers)
    {
        int max = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++)
        {
            // Keeps changing max as larger numbers are inputted
            if (max < numbers.get(i))
            {
                max = numbers.get(i);
            }
        }

        return  max;
    }

    public static int min(ArrayList<Integer> numbers)
    {
        int min = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++)
        {
            // Keeps changing min as smaller numbers are inputted
            if (min > numbers.get(i))
            {
                min = numbers.get(i);
            }
        }

        return  min;
    }

    public static double std(ArrayList<Integer> numbers, double average)
    {
        double std;
        double sum = 0;

        for (int i = 0; i < numbers.size(); i++)
        {
            sum += Math.pow(numbers.get(i)-average, 2);
        }

        std = Math.sqrt(sum / numbers.size());

        return std;
    }
}