
import java.util.Scanner;

public class diceGame {
    public static void main(String[] args) {

     
        int userGuess = 0;
        int guessCounter = 0;
        guessCounter++;
        // Minimum value of range
        final int MIN = 1;
        // Maximum value of range
        final int MAX = 6;
        
        // Print the min and max  
        System.out.println("Random value in int from " + MIN + " to " + MAX + ":");
        
        // Generate random int value from min to max
        int randomInt = (int) Math.floor(Math.random() * (MAX - MIN + 1) + MIN);
        
        //This prints welcome to my number guessing game 
        System.out.println("Welcome to my amazing number guessing game!");

          //This prints out the amount the user would like 
        System.out.print("Guess a number in the range of 1-6 : ");

        do {
          try { 
              Scanner sc = new Scanner(System.in);
              userGuess = sc.nextInt();
              guessCounter++;
              //This sees if the user guess is lower than randomInt
              if (userGuess > randomInt) {
                //This prints guess lower 
                System.out.print("Guess lower: ");
              }
              //This checks if the userGuess is higher than randomInt
              else if (userGuess < randomInt) {
                //This prints out guess higher   
                System.out.print("Guess higher: ");
              } else {
                //This let's the user know that they are correct'  
                System.out.println("You guessed correctly, great job!");
                //This tells how many guesses it took to get the number 
                  System.out.println("It took " + guessCounter + " guess(es)");
              }
                  

            } catch (Exception e) {
              //this catches any errors that are inputted by the user 
              System.out.println("Error: Invalid input entered.");
            }
        } while (userGuess != randomInt);
    }
}
