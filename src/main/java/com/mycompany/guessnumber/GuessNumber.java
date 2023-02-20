/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guessnumber;

/**
 *
 * @author Naweed
 */

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer = (int) (Math.random() * 1000) + 1;
        String playAgain = "y";

        while (playAgain.equalsIgnoreCase("y")) {
            System.out.println("I'm thinking of a number between 1 and 1000. Can you guess what it is?");
            int guess = 0;
            int attempts = 0;

            while (guess != answer) {
                System.out.print("Enter your guess: ");
                guess = input.nextInt();
                attempts++;

                if (guess < answer) {
                    System.out.println("Too low... Try again!");
                } else if (guess > answer) {
                    System.out.println("Too high... Try again!");
                }
            }

            System.out.printf("CONGRATULATIONS! You guessed the number in %d attempts.%n", attempts);

            System.out.print("Do you want to play again? (y/n): ");
            playAgain = input.next();
            answer = (int) (Math.random() * 1000) + 1;
        }

        input.close();
    }
}
