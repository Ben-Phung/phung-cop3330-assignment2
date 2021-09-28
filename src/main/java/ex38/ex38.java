/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Ben Phung
 */

package ex38;

import java.util.ArrayList;
import java.util.Scanner;

public class ex38
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        // Prompt
        System.out.print( "Enter a list of numbers, separated by spaces: " );
        String numList = input.nextLine();

        // Splits up the numbers by using the spacebar (" ") input in between each number
        String[] array = numList.split(" ");
        // Create array for new and old numbers
        // Double so we can use %
        double[] oldList = new double[array.length];

        for(int i = 0; i < array.length; i++)
        {
            oldList[i] = Double.parseDouble(array[i]);
        }
        // Amount of even numbers goes through each number from old list
        int evenAmount = 0;
        for(int i = 0; i < oldList.length; i++)
        {
            if(oldList[i] % 2 == 0)
            {
                evenAmount++;
            }
        }
        // Fills in new array
        double[] evenList = new double[evenAmount];
        int j = 0;
        for(int i = 0; i < oldList.length; i++)
        {
            if(oldList[i] % 2 == 0)
            {
                evenList[j] = oldList[i];
                j++;
            }
        }
        // Output
        System.out.print( "The even numbers are " );
        for(int i=0; i < evenList.length; i++)
        {
            if(i < evenList.length-1)
            {
                System.out.printf( "%.0f ", evenList[i]);
            }
            // Else at end, end with a period
            else
            {
                System.out.printf( "%.0f.", evenList[i]);
            }
        }
    }
}