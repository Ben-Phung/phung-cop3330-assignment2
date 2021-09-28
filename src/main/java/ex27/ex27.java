/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Ben Phung
 */

package ex27;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ex27
{
    static String input = "";
    public static int validateInput(String firstName, String lastName, String zip, String ID)
    {
        boolean bFirst = validateFirst(firstName);
        boolean bLast = validateLast(lastName);
        boolean bZip = validateZip(zip);
        boolean bID = validateID(ID);

        // If all return true then there are no errors
        if (bFirst && bLast && bZip && bID)
        {
            input = "There were no errors found.";
            return 1;
        }
        System.out.println(input);
        return 0;
    }

    // Initialize each boolean as true to be used in the validateInput function for when there are no errors
    public static boolean validateFirst (String firstName)
    {
        boolean bFirst = true;

        if (firstName.length() == 0)
        {
            input += "The first name must be filled in.\n";
            bFirst = false;
        }

        else if (firstName.length() < 2)
        {
            input += "The first name must be at minimum 2 characters long.\n";
            bFirst = false;
        }

        return bFirst;

    }
    public static boolean validateLast (String lastName)
    {
        boolean bLast = true;

        if (lastName.length() == 0)
        {
            input += "The last name must be filled in.\n";
            bLast = false;
        }

        if (lastName.length() < 2)
        {
            input += "The last name must be at minimum 2 characters long.\n";
            bLast = false;
        }

        return bLast;
    }
    public static boolean validateZip (String zip)
    {
        boolean bZip = true;
        // Use try and catch to test zip length and if the zip is a number
        try
        {
            if (zip.length() != 5)
            {
                input += "The zipcode must be a 5 digit number.\n";
                bZip = false;
            }
            //double dZip = Double.parseDouble(zip);
        } catch (InputMismatchException e) {
            input += "The zipcode must be a 5 digit number.\n";
            bZip = false;
        }
        return bZip;

    }
    public static boolean validateID (String ID)
    {
        // Set the allowed input pattern using regex.Pattern
        String pattern = "[a-zA-Z]{2}[-][0-9]{4}";
        if (!Pattern.matches(pattern, ID))
        {
            input += "The employee ID must be in the format of AA-1234.\n";
            return false;
        }
        return true;
    }
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        // Prompt user
        System.out.print( "Enter the first name: " );
        String firstName = scan.nextLine();

        System.out.print( "Enter the last name: " );
        String lastName = scan.nextLine();

        System.out.print( "Enter the ZIP code: " );
        String zip = scan.nextLine();

        System.out.print( "Enter the employee ID: " );
        String ID = scan.nextLine();
        // Call in main
        validateInput(firstName, lastName, zip, ID);

    }
}
