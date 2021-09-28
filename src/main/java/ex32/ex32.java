/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Ben Phung
 */

package ex32;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex32
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        String again;
        int difficulty = 0;
        int number = 0;
        int guess;
        int numGuess = 0;

        System.out.println( "Let's play Guess the Number!" );
        // Whole thing will run until user inputs something other than Y (yes)
        do {
            // Keep prompting for difficulty until a correct response
            while (difficulty < 1)
            {
                try{
                    System.out.println( "Enter the difficulty level (1, 2, or 3): ");
                    difficulty = scan.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println( "Invalid input." );
                    scan.nextLine();
                }
            }

            // For if difficulty input is greater than
            while (difficulty > 3)
            {
                try{
                    System.out.println( "Enter the difficulty level (1, 2, or 3): ");
                    difficulty = scan.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println( "Only enter the numbers 1, 2, or 3" );
                    scan.nextLine();
                }
            }

            // Calculating different random numbers depending on difficulty choice
            if (difficulty == 1)
                number = (int) (Math.random() * 10 + 1);
            else if (difficulty == 2)
                number = (int) (Math.random() * 100 + 1);
            else if (difficulty == 3)
                number = (int) (Math.random() * 1000 + 1);



            System.out.print( "I have my number. What's your guess? ");
            // Do while loop for guessing the number
            do {
                guess = scan.nextInt();
                // increase number of guesses each time the user gets the number wrong
                numGuess++;
                if (guess == number)
                {
                    System.out.println( "You got it in "+numGuess+"  guesses!" );
                }
                else if (guess < number)
                {
                    System.out.println( "Too low! Guess again: " );
                }
                else
                {
                    System.out.println( "Too high! Guess again: " );
                }
            } while (number != guess);

            System.out.println( "Do you wish to play again (Y/N)? ");
            again = scan.next();
            // Set difficulty back to 0 to play with different difficulty
            difficulty = 0;
        } while (again.equalsIgnoreCase("Y"));

    }
}