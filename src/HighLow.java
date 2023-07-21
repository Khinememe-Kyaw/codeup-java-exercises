import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the High-Low Guessing Game!");
        System.out.println("The game has picked a random number between 1 and 100.");

        int randomNumber = generateRandomNumber();
        int userGuess;

        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess < randomNumber) {
                System.out.println("HIGHER");
            } else if (userGuess > randomNumber) {
                System.out.println("LOWER");
            } else {
                System.out.println("GOOD GUESS!");
            }

        } while (userGuess != randomNumber);

        System.out.println("Congratulations! You guessed the correct number.");

        scanner.close();
    }

    public static int generateRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }
}
