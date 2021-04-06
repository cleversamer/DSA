package com.me;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // I made this simple guessing-game using recursion theory.
        // You can debug it, if you can do it, then you got a full understanding of recursion theory.
        guessing(2, 1, 2);  // Calling recursive method.
    }

    static void guessing(int tries, int level, int range) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("*********       *****************       ***********\n" +
                    "Level: " + level + "\t\tTries allowed: " + tries + "\t\tRange(1-" + range + ")");
            int wins = 0;
            for (int i = 0; i < tries; i++) {
                int rnd = (int) (Math.random() * range) + 1;
                System.out.print("* Guess number: ");
                int guess = scanner.nextInt();
                boolean notInRange = guess > range || guess < 1;
                while (notInRange) {
                    System.out.println("Guessing number not in range, try again!!");
                    System.out.print("* Guess number: ");
                    guess = scanner.nextInt();
                    notInRange = guess > range || guess < 1;
                }
                if (rnd == guess) {
                    System.out.println("Yes!");
                    wins++;
                } else {
                    System.out.println("Sorry~ it was " + rnd);
                }
            }
            if (wins >= (tries / 2))
                guessing(tries + 1, level + 1, range + 1);
            else
            System.out.println("You lost at level " + level + ", try again!");
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("Invalid guessing number, try again!!");
            guessing(tries, level, range);
        }
    }
}
