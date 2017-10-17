// ****************************************************************
//   Guess.java
//
//   Play a game where the user guesses a number from 1 to 10
//              
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
 
public class Guess
{
    public static void main(String[] args)
        {
          int numToGuess;           //Number the user tries to guess
          int guess;       
          int numberGuess = 0;
          int numberGuessHigh = 0;
          int numberGuessLow = 0;
 
          Scanner scan = new Scanner(System.in);
          Random generator = new Random();
 
          //randomly generate the  number to guess
          numToGuess = generator.nextInt(10) + 1;
 
          //print message asking user to enter a guess
          System.out.println("Guess a number between 1 and 10");
          guess = scan.nextInt();
 
          //read in guess
                    
          while (guess != numToGuess)  //keep going as long as the guess is wrong
            {
                if (guess < numToGuess){
                    System.out.println("Your guess is too low - Guess Again");
                    
                   
                    numberGuess ++;
                    numberGuessLow++;
                    
                }
                else if (guess > numToGuess){
                    System.out.println("Your guess is too high - Guess Again");
                    
                    numberGuess ++;
                    numberGuessHigh++;
                    
                    
                }
                guess = scan.nextInt();
          }
 
          //print message saying guess is right
          System.out.println("Congrats - you guessed the right number!");
          System.out.println("Number of guesses: " + numberGuess);
          System.out.println("Number of guesses too high: " + numberGuessHigh);
          System.out.println("Number of guesses too low: " + numberGuessLow);
        }
}