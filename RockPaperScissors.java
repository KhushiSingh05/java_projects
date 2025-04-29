import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] choices = { "Rock", "Paper", "Scissors" };

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Enter your choice (Rock, Paper, Scissors). To exit the game, type 'exit':");

        while (true) {
            System.out.println("Your choice: ");
            String userChoice = sc.nextLine();

            if (userChoice.equalsIgnoreCase("exit")) {
                System.out.println("Thanks for playing!");
                break;
            }

            if (!userChoice.equalsIgnoreCase("Rock") && !userChoice.equalsIgnoreCase("Paper")
                    && !userChoice.equalsIgnoreCase("Scissors")) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            int computerIndex = random.nextInt(3);
            String computerChoice = choices[computerIndex];

            System.out.println("Computer choice: " + computerChoice);

            if (userChoice.equalsIgnoreCase("userChoice")) {
                System.out.println("It's a tie!");
            } else if (userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")
                    || userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")
                    || userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }
        sc.close();
    }
}
