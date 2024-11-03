import java.util.Scanner;
import java.util.Random;

public class Numberguess {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("********Welcome to the Guess the Number Game!**********");
        System.out.println("In this game you will try to guess a number between 1 and 100");
        System.out.print("How many rounds would you like to play? ");
        int rounds = input.nextInt();

        System.out.print("Enter the maximum number of attempts per round: ");
        int maxAttempts = input.nextInt();

        for (int round = 1; round <= rounds; round++) {
            int randomNumber = random.nextInt(100) + 1;
            System.out.println("\nRound " + round + " of " + rounds + " has begun!");
            System.out.println("I have picked a number between 1 and 100 Try to guess it!");

            boolean guessedCorrectly = false;

            for (int attempt = 1; attempt <= maxAttempts; attempt++) {
                System.out.print("Attempt " + attempt + " of " + maxAttempts + ": Your guess? ");
                int userGuess = input.nextInt();

                if (userGuess == randomNumber) {
                    System.out.println("Great job! You have guessed the correct number: " + randomNumber);
                    guessedCorrectly = true;
                    break;
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low,Try a higher number.");
                } else {
                    System.out.println("Too high,Try a lower number.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Out of attempts! The correct number was: " + randomNumber);
            }
        }

        System.out.println("\nThanks for playing! Hope you enjoyed the  Game");
    }
}
