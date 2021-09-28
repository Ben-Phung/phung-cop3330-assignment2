/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Ben Phung
 */

package ex25;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex25
{
    public static int passwordValidator (String password)
    {
        // Length of password to see size
        int length = password.length();

        // Initialize letters numbers and specials as boolean
        boolean Letter = false, Number = false, Special = false;
        // Create a character set of the special characters
        Set <Character> set = new HashSet <Character> (
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')'));
        for (char i : password.toCharArray())
        {
            if (Character.isLetter(i))
                Letter = true;

            if (Character.isDigit(i))
                Number = true;

            if (set.contains(i))
                Special = true;
        }

        if (Number && Letter && Special && (length >= 8))
        {
            System.out.println( password+ " is a very strong password." );
            return 4;
        }


        else if (Letter && Number && (length >= 8))
        {
            System.out.println( password+ " is a strong password." );
            return 3;
        }


        else if (Letter && (length < 8))
        {
            System.out.print( password+ " is a weak password." );
            return 2;
        }


        else if (Number && (length < 8))
        {
            System.out.print( password+ " is a very weak password" );
            return 1;
        }

            // Last one is for passwords that don't fall into the constraints of the assignment
            // For example a password that is 8 characters long but is composed of only numbers
            // Instructions did not specify what category these would fall under
        else
            System.out.println( "Not within constraints." );

        return 0;
    }

    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        // Prompt for password
        System.out.println( "Enter Password: " );
        String password = scan.nextLine();
        // Call function in main
        passwordValidator(password);
    }
}
