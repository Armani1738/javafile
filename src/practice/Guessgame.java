package practice;
import java.util.Scanner;
public class Guessgame {
    public class Guess {
        public static void
        guessingNumberGame()
        {
            Scanner scanner = new Scanner(System.in);
            int number = 1 + (int)(100 * Math.random());
            int Playerguess = 5;
            int count, guess;
            System.out.println("    ===== Welcome To GNGSU Games =====    ");
            System.out.println("Game rules: Between 1 - 100 guess the right answer,You've got just 5 trials\n" +
                    "                            Thank you!");
            for (count = 0; count < Playerguess; count++) {
                System.out.println("Guess the number:");
                guess = scanner.nextInt();
                if (number == guess) {
                    System.out.println("Congratulations!" + " You guessed the number.");
                    break;
                }
                else if (number > guess && count != Playerguess - 1) {
                    System.out.println("The number is " + "greater than " + guess);
                }
                else if (number < guess && count != Playerguess - 1) {
                    System.out.println("The number is" + " less than " + guess);
                }
            }
            if (count == Playerguess) {
                System.out.println("You have exhausted" + " GNGSU game trials.");
                System.out.println("The number was " + number);
            }
        }
    }
}
