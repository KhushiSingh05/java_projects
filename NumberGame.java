import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String args[]) throws IOException {
        Scanner obj = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("\nWelcome to the Number Game.\nThe System will generate a random number b/w 1-100.");
        System.out.println("You have to guess that random number.");
        System.out.print("Enter the Number of Rounds (between 1-3) you want to play the Game : ");
        int rounds = obj.nextInt();

        for (int i = 1; i <= rounds; i++) {
            System.out.println();
            System.out.println("Round " + i + " begins !!\n");

            System.out.println("Please Enter the Difficulty Level:\n1 --> Easy (Unlimited attempts)\n2 --> Hard (Limited attempts)");
            int limits = obj.nextInt();

            switch (limits) {
                case 1: {
                    System.out.println("Opted for Easy Difficulty.\nHence, there is No Limit to number of attempts\n");

                    int randomNumber = 1 + rand.nextInt(100);
                    System.out.println("Random Number has been generated...");

                    int count = 1;
                    whileloop: while (true) {
                        System.out.print("Enter you guess number " + count + ": ");
                        int guess = obj.nextInt();
                        if (guess > randomNumber) {
                            System.out.println("The number " + guess + " is HIGHER than the number. Try again...");
                        } else if (guess < randomNumber) {
                            System.out.println("The number " + guess + " is LOWER than the number. Try again...");
                        } else {
                            System.out.println(
                                    "Yes  " + guess + " is correct guessed number.\nCongrats it took you "+ count + " attempts.");
                            break whileloop;
                        }
                        count++;
                    }
                    break;
                }
                case 2: {
                    System.out.println("You chose hard.\n limited turns");
                    System.out.println("The limit is just 5.\nIf you have guessed the number in 4 or less attempts you have won the game.\n Else you will lose the game.\n");
                    int randomNumber = 1 + rand.nextInt(100);
                    System.out.println("Random Number has been generated...");

                    int count = 1;
                    whileloop: while (count <= 4) {
                        System.out.println("\nNo of chances left : " + (5 - count) + " ...\n");
                        System.out.print("Enter your guess number " + count + ": ");
                        int guess = obj.nextInt();
                        if (guess > randomNumber) {
                            System.out.println("The number " + guess+ " is HIGHER than the number.Try again...");
                        } else if (guess < randomNumber) {
                            System.out.println("The number " + guess + " is LOWER than Generated Number. Try again...");
                        } else {
                            System.out.println(
                                    "Yes " + guess + " is correct guessed Number.\nCongrats it took you " + count + " attempts.");
                            break whileloop;
                        }
                        count++;
                    }
                    if (count > 4) {
                        System.out.println( "OOPS!!! \nThe Generated Number was " + randomNumber + "\nBETTER LUCK NEXT TIME\n");
                    }
                    break;
                }
                default: {
                    System.out.println("--- WRONG INPUT ---\n");
                    break;
                }
            }

            System.out.println("Round " + i + " is Over.");
        }
        System.out.println("\nAll the Rounds are over.\nThank You for Playing the Game.");
        obj.close();
    }
}

