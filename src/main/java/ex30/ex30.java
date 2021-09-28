/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Ben Phung
 */

package ex30;

public class ex30
{
    public static void main( String[] args )
    {
        int i,j;
        // Initialize i and j as 1 since we need to multiply starting with 1
        for (i = 1; i < 13; i++)
        {
            for (j = 1; j < 13; j++)
            {
                int product = i*j;
                // Use printf to be able to have empty spaces
                System.out.printf( "%4d", product);
            }
            System.out.println( "" );
        }

    }
}