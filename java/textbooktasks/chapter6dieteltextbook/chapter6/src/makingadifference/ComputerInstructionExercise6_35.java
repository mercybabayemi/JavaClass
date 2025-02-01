package makingadifference;

import java.security.SecureRandom;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ComputerInstructionExercise6_35 {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        Scanner input = new Scanner(System.in);
        mainMenu(random,input);

    }
    public static void mainMenu(SecureRandom random, Scanner input) {
        System.out.println("Welcome to Computer Program");
        System.out.println("Please enter a number to begin and -1 to stop the program: ");
        int userInput = validateIntInput(input);
        while(userInput != -1) {
           int correctAnswer =  generateComputerInstruction(random);
           confirmAnswer(correctAnswer, input);

           System.out.println("Please enter a number to begin and -1 to stop the program: ");
           userInput = validateIntInput(input);
        }
        System.out.println("Bye!!");
    }

    public static void confirmAnswer(int correctAnswer,Scanner input) {
        int response = validateIntInput(input);

        while(correctAnswer != response) {
            System.out.println("No.Please try again.");
            response = validateIntInput(input);
        }
        System.out.println("Very good.");
    }

    public static int generateComputerInstruction(SecureRandom random) {
        int secureRandomInt1 = random.nextInt(10);
        int secureRandomInt2 = random.nextInt(10);

        System.out.printf("How much is %d times %d%n", secureRandomInt1, secureRandomInt2);

        int correctAnswer = secureRandomInt1 * secureRandomInt2;
        return correctAnswer;
    }

    public static int validateIntInput(Scanner input) {
        boolean validInput = false;
        int response = 0;

        while (!validInput) {
            try{
                String userInput = input.nextLine().trim();
                if (userInput.isEmpty()) System.out.println("Input cannot be empty");
                response = Integer.parseInt(userInput);
                validInput = true;
            }catch (InputMismatchException e){
                System.out.println("Invalid input. Please enter an integer.");
                input.nextLine();
            }
        }
        return response;
    }
}
