/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Ben Phung
 */

package ex33;

import java.util.Scanner;
import java.util.Random;

public class ex33
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        String[] answers = {"Yes", "No", "Maybe", "Ask again later"};
        Random rand = new Random();

        int iRandom = rand.nextInt(answers.length);

        // Question doesn't matter so don't need to store it
        System.out.print( "What's your question?\n> ");
        scan.nextLine();

        String response = answers[iRandom];
        System.out.println(response);
    }
}