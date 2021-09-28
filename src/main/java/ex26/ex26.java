/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Ben Phung
 */

package ex26;

import java.lang.Math;
import java.util.Scanner;

public class ex26
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        // Call class
        PaymentCalculator amount = new PaymentCalculator();

        // Prompt user
        System.out.print( "What is your balance? " );
        double balance = scan.nextDouble();

        System.out.print( "What is the APR on the card (as a percent)? " );
        double apr = scan.nextDouble();
        // Convert to percent
        double aprPercent = apr/100;

        System.out.print( "What is the monthly payment you can make? " );
        double payment = scan.nextDouble();

        // Call method
        double months = amount.calculateMonthsUntilPaidOff(balance, aprPercent, payment);
        // Format double months with 0 decimals
        System.out.println( "It will take you " + String.format("%.0f",months) + " months to pay off this card." );

    }
}
// Class to calculate
class PaymentCalculator
{
    public static double calculateMonthsUntilPaidOff(double balance, double apr, double payment)
    {
        double months;
        // rate or i in the formula is apr/365
        double rate = apr / 365;

        // n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        months = -(1.0/30.0) * Math.log(1 + balance / payment * (1 - Math.pow((1 + rate),30))) / Math.log(1 + rate);
        // Ceil rounds up
        months = Math.ceil(months);

        return months;
    }
}
