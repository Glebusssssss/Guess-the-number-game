
import java.util.Random; // Import the Random class for generating random numbers
import java.util.Scanner; // Import the Scanner class for capturing user input

public class GuessTheNumberGame {
   
    public static void main(String[] args){

        // Create a Random object to generate random numbers
        Random random = new Random();

        // Generate a random number between 0 and 99
        int randomNumber = random.nextInt(100);

         // Create a Scanner object to capture user input
        try (Scanner sc = new Scanner (System.in)){
            System.out.println("I created a random number, try to guess what it is:");
            

        // Start a loop to allow the user to keep guessing until they guess correctly
        while (true) {

        // Prompt the user for their guess
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();

        // Check if the guessed number is correct
            if (guess== randomNumber) {
                System.out.println("Well done! You guessed the number!");
        // Exit the loop if the guess if correct
                break;  

        // If the guess is too low, give a hint
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");

        // If the guess is too high, give a hint
            } else {
                // If the guess is too high, give a hint
                System.out.println("Too high! Try again.");
            }
        }
            
            
        }

        

            
        }

        
    }

