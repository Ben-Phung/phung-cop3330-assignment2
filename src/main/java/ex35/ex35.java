/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Ben Phung
 */

package ex35;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ex35
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        String input = "";

        ArrayList<String> names = new ArrayList<String>();

        do
        {
            System.out.print( "Enter a name: " );
            input = scan.nextLine();

            if(!input.equals(""))
            {
                names.add(input);
            }
        }while(!input.equals(""));

        Random rand = new Random();
        int iRandom = rand.nextInt(names.size());

        System.out.println( "The winner is... " + names.get(iRandom));

    }
}