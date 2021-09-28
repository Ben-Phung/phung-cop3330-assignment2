/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Ben Phung
 */

package ex37;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class ex37
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        // Scanning in amounts of each character
        System.out.print( "What's the minimum length? " );
        int minLength = scan.nextInt();

        char[] string = new char[minLength];

        System.out.print( "How many special characters? " );
        int specialAmount = scan.nextInt();

        System.out.print( "How many numbers? " );
        int numAmount = scan.nextInt();

        String letters = "abcdefghijklmnopqrstuvwxyz";
        String special = "!@#$%^&*()";
        String numbers = "0123456789";

        Random random = new Random();
        // Array list of characters
        ArrayList<Character> characters = new ArrayList<>();

        // Add random special characters
        for(int i = 0; i < specialAmount; i++)
        {
            characters.add(special.charAt(random.nextInt(special.length())));
        }
        // Add random numbers
        for (int i = 0; i < numAmount; i++)
        {
            characters.add(numbers.charAt(random.nextInt(numbers.length())));
        }
        // Add random letters
        for (int i = characters.size() - 1; i < minLength; i++)
        {
            characters.add(letters.charAt(random.nextInt(letters.length())));
        }

        Collections.shuffle(characters);
        String password = "";
        for (Character j : characters)
        {
            password += Character.toString(j);
        }

        System.out.println("Your password is " + password);
    }
}