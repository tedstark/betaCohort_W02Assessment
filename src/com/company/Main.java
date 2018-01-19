package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write a guessing game program.
        // Your program should generate a random integer between 1 and 10000.
        // Prompt the user to enter a guess.
        // For each guess, output "HIGHER" if the guess is smaller than the random integer
        // or "LOWER" if the user's guess is larger than the random integer.
        // Also output the new range of eligible guesses.
        // When the user guesses the random integer, output a message that says so
        // and displays the number guesses it took to get to the right number.
        // Additionally, it should show what numbers the user guessed along the way.

        Scanner phillip = new Scanner(System.in);

        //Welcome & get name
        System.out.println("Hello Player! Welcome to the Number Guessing Game!");
        System.out.println("What is your name?");
        String playerName = phillip.nextLine();

        //Information & ask to play
        System.out.println("");
        System.out.println("Nice to meet you " + playerName + "!");
        System.out.println("");
        System.out.println("The object of this game is to guess a number between 1 and 10000.");
        System.out.println("You can guess as many times as you want, and I will help you with hints along the way.");
        System.out.println("");
        System.out.println("Would  you like to play? (Yes/No)");
        String playGame = phillip.nextLine();

        //loop to handle any answer besides Yes or No ignoring capitalization
        while (!playGame.equalsIgnoreCase("yes") && (!(playGame.equalsIgnoreCase("no")))) {
            System.out.println("I'll need a Yes or No answer from you.");
            playGame = phillip.nextLine();
        }
        //MAIN WHILE LOOP BEGINS
        while (playGame.equalsIgnoreCase("yes")) {
            System.out.println("Wonderful! Let me pick a number...");
            // random number block
            Random random = new Random();
            int secretNumber = random.nextInt(10000);
            // code to pause while "thinking"
            try {
                Thread.sleep(1000);
            } catch (InterruptedException pause) {
                pause.printStackTrace();
            }
            System.out.println("Okay, got the number!");
            System.out.println("My secret number is: " + secretNumber);

            //ask to play again
            System.out.println("Would you like to play again?");
            playGame = phillip.nextLine();

        }
        if (playGame.equalsIgnoreCase("no")) {
            System.out.println("Thanks for playing " + playerName + "! Have a great day!. Good-bye!");
            System.exit(0);
        }
    }
}