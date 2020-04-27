package com.company;

import java.util.Random;
import java.util.Scanner;

public class KeepGuessing {
    public void guess(){
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        int input = 0;
        int r = rand.nextInt(10 + 1);
        int numberOfGuesses = 0;

        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        input = s.nextInt();

        while(true){
            System.out.println("Your Guess: " + input );
            if(input != r){
                System.out.println("that is incorrect. Guess again");
                input = s.nextInt();
                numberOfGuesses++;
            }else{
                System.out.println("Thats right you are a good guesser!");
                numberOfGuesses++;
                System.out.println("Took you " + numberOfGuesses + " guesses tho...");
                break;
            }
        }

    }
}
