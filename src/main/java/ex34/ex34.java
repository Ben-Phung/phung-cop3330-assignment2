/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Ben Phung
 */

package ex34;

import java.util.ArrayList;
import java.util.Scanner;

public class ex34
{

    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        // Create array list for names
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add( "John Smith" );
        nameList.add( "Jackie Johnson" );
        nameList.add( "Chris Jones" );
        nameList.add( "Amanda Cullen" );
        nameList.add( "Jeremy Goodwin" );

        System.out.println("There are "+nameList.size()+" employees.");
        // Prints out each name using indexes of the names
        for (int i = 0; i < nameList.size(); i++)
        {
            System.out.println(nameList.get(i));
        }

        System.out.print( "\nEnter an employee name to remove: " );
        String removeName = scan.nextLine();
        // Formatting
        System.out.println( "" );
        nameList.remove(nameList.indexOf(removeName));

        System.out.println("There are "+nameList.size()+" employees.");
        // Prints out each name using indexes of the names
        for (int j = 0; j < nameList.size(); j++)
        {
            System.out.println(nameList.get(j));
        }
    }
}