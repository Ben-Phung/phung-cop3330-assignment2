/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Ben Phung
 */

package ex29;

import java.util.Scanner;

public class ex29
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int rate;
        int years;
        // Use while loop and break when input is correct
        while (true)
        {
            System.out.print( "What is the rate of return? " );
            // Tests if the input is integer
            if (scan.hasNextInt())
            {
                rate = scan.nextInt();
                if (rate >=1 && rate <= 72)
                {
                    // years = 72 / r formula calculation
                    years = calcYears(rate);
                    System.out.println( "It will take "+years+" years to double your initial investment" );
                    break;
                }
                else
                {
                    System.out.println( "Sorry. That's not a valid input" );
                    scan.nextLine();
                }
            }
            else
            {
                System.out.println( "Sorry. That's not a valid input" );
                scan.nextLine();
            }

        }
    }
    public static int calcYears(int rate)
    {
        int years;
        years = 72 / rate;
        return years;
    }
}
