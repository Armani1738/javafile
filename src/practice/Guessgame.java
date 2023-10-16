package practice;
import java.util.Scanner;
public class Guessgame {
    public class GuessGame {
        public static void
        guessingNumberGame()
        {
            Scanner scanner = new Scanner(System.in);
            int number = 1 + (int)(50 * Math.random());
            int playerGuess = 5;
            int count, guess;
            System.out.println("===== Welcome To GNGSU Games =====");
            System.out.println("Game rules: Between 1 - 50 guess the right answer,You've got just 5 trials\n" +
                    "                            Thank you!");
            for (count = 0; count < playerGuess; count++) {
                System.out.println("Guess the number:");
                guess = scanner.nextInt();
                if (number == guess) {
                    System.out.println("Congratulations!" + " You guessed the number.");
                    break;
                }
                else if (number > guess && count != playerGuess - 1) {
                    System.out.println("The number is " + "greater than " + guess);
                }
                else if (number < guess && count != playerGuess - 1) {
                    System.out.println("The number is" + "less than " + guess);
                }
            }
            if (count == playerGuess) {
                System.out.println("You have exhausted" + "GNGSU game trials.");
                System.out.println("The number was " + number);
            }
        }
    }
}
