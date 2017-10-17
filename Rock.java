// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
public class Rock
{
    public static void main(String[] args)
    {
        String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay;  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
                              //computer's play
        Random generator = new Random();
        //Get player's play -- note that this is stored as a string
        
        Scanner scan = new Scanner(System.in);
 
        System.out.print ("Enter R (rock), P (paper), or S(scissors) ");
        personPlay = scan.next().toUpperCase(); //Make player's play uppercase for ease of comparison
        
        //Generate computer's play (0,1,2)
        
        computerInt = generator.nextInt(2) + 1;
        //Translate computer's randomly generated play to string
        if (computerInt == 0){
            computerPlay = "R";
        }
        else if (computerInt == 1){
            computerPlay = "P";
        }
        else {
            computerPlay = "S";
        }
        
        
        //Print computer's play
        
                //Print computer's play
        System.out.println("Your pick: " + personPlay);
        System.out.println("Computer's pick: " + computerPlay);
        //See who won.
        if (computerPlay.equals("R") && personPlay.equals("S")) {
          System.out.println("You Lose");
        } else if (computerPlay.equals("R") && personPlay.equals("P")) {
          System.out.println("You Win");
        } else if (computerPlay.equals("R") && personPlay.equals("R")) {
          System.out.println("Tie, play again");
        } else if (computerPlay.equals("P") && personPlay.equals("R")) {
          System.out.println("You Lose");
        } else if (computerPlay.equals("P") && personPlay.equals("S")) {
          System.out.println("You win");
        } else if (computerPlay.equals("P") && personPlay.equals("P")) {
          System.out.println("Tie, play again");
        } else if (computerPlay.equals("S") && personPlay.equals("R")) {
          System.out.println("You win");
        } else if (computerPlay.equals("S") && personPlay.equals("P")) {
          System.out.println("You Lose");
        } else if (computerPlay.equals("S") && personPlay.equals("S")) {
          System.out.println("Tie, play again");
        } else {
          System.out.println("Something went wrong!");
        }
        
    }
}
