import java.util.*;  //java package

public class NumberGame //class declaration
	{
    public static void main(String[] args) 
		{
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int startRange = 1; //minimum
        int endRange = 100; //maximum
        int max_Attempts = 5;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        boolean playAgain = true;

        while (playAgain) 
			{
            int targetNumber = random.nextInt(endRange - startRange + 1) + startRange;
            int attempts = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println("I'm thinking of a number between " + startRange + " and " + endRange + ".");

            while (attempts < max_Attempts && !hasGuessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < targetNumber)
					{
                    System.out.println("Too low! Try again.");
                }
				else if (userGuess > targetNumber)
					{
                    System.out.println("Too high! Try again.");
                } 
				else 
					{
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    score++;
                    hasGuessedCorrectly = true;
                }
            }

            if (!hasGuessedCorrectly)
				{
                System.out.println("Sorry, you've run out of attempts. The correct number was " + targetNumber + ".");
                }

            System.out.println("Your current score: " + score);

            System.out.print("Want to Play again? (yes/no): ");
            String playAgainResponse = scanner.next().toLowerCase();
            playAgain = playAgainResponse.equals("yes");
        }

        System.out.println("Thank you for playing! Your final score: " + score);
    }
}
