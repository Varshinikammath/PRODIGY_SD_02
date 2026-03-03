import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        Random random = new Random();
        
        Scanner sc = new Scanner(System.in);

        int numberToGuess = random.nextInt(100) + 1;
        // Random number between 1 and 100
        int userGuess = 0;
        int attempts = 0;

        System.out.println(" Welcome to the Guessing Game!");
        System.out.println("Guess a number between 1 and 100");

        while (userGuess != numberToGuess) {

            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();
            attempts++;

            if (userGuess < numberToGuess) {
                System.out.println("Too Low! Try again.");
            } 
            else if (userGuess > numberToGuess) {
                System.out.println("Too High! Try again.");
            } 
            else {
                System.out.println(" Congratulations! You guessed the number.");
                System.out.println("Total attempts: " + attempts);
            }
        }

        sc.close();
    }
}
