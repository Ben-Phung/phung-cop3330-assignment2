/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Ben Phung
 */

package ex28;

import java.util.Scanner;

public class ex28
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        int value;

        for (int i = 0; i <5; i++)
        {
            System.out.print( "Enter the value: " );
            value = scan.nextInt();
            System.out.println(value);
            sum += calcSum(value);
        }
        System.out.println( "The total is " +sum+ "." );
    }
    public static int calcSum(int value)
    {
        int sum = 0;
        sum += value;
        return sum;
    }
}