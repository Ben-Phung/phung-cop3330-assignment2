/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Ben Phung
 */

package ex24;

import java.util.Arrays;
import java.util.Scanner;

public class ex24
{
    public static boolean isAnagram(String string1, String string2)
    {
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();

        // If the length of the strings aren't the same it automatically isn't an anagram
        if (string1.length() != string2.length())
        {
            return false;
        }

        // Initialize strings as character arrays to be sorted
        char[] cString1 = string1.toCharArray();
        char[] cString2 = string2.toCharArray();

        // Sort characters
        Arrays.sort(cString1);
        Arrays.sort(cString2);

        return Arrays.equals(cString1, cString2);
    }

    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        // Prompt user
        System.out.println( "Enter two strings and I'll tell you if they are anagrams:" );

        System.out.print( "Enter the first string: " );
        String string1 = scan.nextLine();

        System.out.print( "Enter the second string: " );
        String string2 = scan.nextLine();

        // If the strings return true then print they are anagrams
        if (isAnagram(string1,string2))
        {
            System.out.print( string1+" and "+string2+" are anagrams. ");
        }
        // Else return they are not
        else
        {
            System.out.print( string1+" and "+string2+" are not anagrams. ");
        }
    }
}
