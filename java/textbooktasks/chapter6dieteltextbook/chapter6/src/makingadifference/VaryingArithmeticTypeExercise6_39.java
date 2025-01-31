package makingadifference;

import java.security.SecureRandom;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class VaryingArithmeticTypeExercise6_39 {

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        Scanner input = new Scanner(System.in);
        mainMenu(random,input);

    }
    public static void mainMenu(SecureRandom random, Scanner input) {
        System.out.println("Welcome to Computer Program");

        ArithmeticType symbol = arithmeticTypeSelection(input);
        int choice = dificultyLevel(input);

        int positiveCount = 0;
        int negativeCount = 0;

        int totalCount = 10;

        while (positiveCount + negativeCount != totalCount) {
            int correctAnswer =  generateQuestionAtDifficultyLevel(input, choice, random, symbol);
            int isCorrect = confirmAnswer(correctAnswer, input);
            negativeCount += (isCorrect > 1 ? isCorrect - 1 : 0);
            positiveCount += (isCorrect >= 1 ? 1 : 0);
        }

        calculatePercentage(positiveCount, totalCount);
        System.out.println("Total correct answers: " + positiveCount);
        System.out.println("Total incorrect answers: " + negativeCount);
        System.out.println("Bye!!");
    }

    public static double calculatePercentage(int positiveCount, int totalAnswers) {
        double calculatedPercentage = ((double)positiveCount / totalAnswers) * 100;
        System.out.println("Your percentage is: " + calculatedPercentage + "%");
        return calculatedPercentage;
    }

    public static int confirmAnswer(int correctAnswer,Scanner input) {
        String[] positiveResponses = {"Very good!", "Excellent!", "Nice work!", "Keep up the good work"};
        String[] negativeResponses = {"No. Please try again.", "Wrong. Try once more", "Don't give up!", "No. Keep trying."};
        Random random = new Random();

        int response = validateIntInput(input);
        int negative = 0;

        while (correctAnswer != response) {
            System.out.println(negativeResponses[random.nextInt(negativeResponses.length)]);
            response = validateIntInput(input);
            negative ++;
        }
        System.out.println(positiveResponses[random.nextInt(positiveResponses.length)]);
        return negative + 1;
    }

    public static ArithmeticType arithmeticTypeSelection(Scanner input) {
        System.out.println("""
                Which arithmetic type do you want to use?
                1. ADDITION = +
                2. SUBTRACTION = -
                3. MULTIPLICATION = *
                4. DIVISION = /
                """);

        int choice = validateIntInput(input);
        switch (choice) {
            case 1:
                return ArithmeticType.Addition;
            case 2:
                return ArithmeticType.Subtraction;
            case 3:
                return ArithmeticType.Multiplication;
            case 4:
                return ArithmeticType.Division;
            default:
                System.out.println("Invalid choice");
                arithmeticTypeSelection(input);
                break;
        }
        return ArithmeticType.Addition;
    }


    public static int dificultyLevel(Scanner input) {
        System.out.println("""
                What level do you want to use?
                1. Easy
                2. Intermediate
                3. Hard
                """);
        int choice = validateIntInput(input);
        return choice;
    }

    public static int generateQuestionAtDifficultyLevel(Scanner input, int choice, SecureRandom random, ArithmeticType symbol) {
        int correctAnswer =  0;
        switch (choice) {
            case 1:
                correctAnswer = generateComputerInstruction(random, symbol, 10, 10);
                break;
            case 2:
                correctAnswer = generateComputerInstruction(random, symbol, 50, 10);
                break;
            case 3:
                correctAnswer = generateComputerInstruction(random, symbol, 100, 50);
                break;
            default:
                System.out.println("Wrong choice. Try again.");
                dificultyLevel(input);
        }

        return correctAnswer;

    }

    public static int generateComputerInstruction(SecureRandom random, ArithmeticType symbol, int min, int max) {
        int secureRandomInt1 = random.nextInt(min);
        int secureRandomInt2 = random.nextInt(max);
        int correctAnswer = 0;

        switch(symbol) {
            case Addition:
                System.out.printf("How much is %d + %d?%n", secureRandomInt1, secureRandomInt2);
                correctAnswer = secureRandomInt1 + secureRandomInt2;
                break;
            case Subtraction:
                System.out.printf("How much is %d - %d?%n", secureRandomInt1, secureRandomInt2);
                correctAnswer = secureRandomInt1 - secureRandomInt2;
                break;
            case Multiplication:
                System.out.printf("How much is %d * %d?%n", secureRandomInt1, secureRandomInt2);
                correctAnswer = secureRandomInt1 * secureRandomInt2;
                break;
            case Division:
                System.out.printf("How much is %d / %d?%n", secureRandomInt1, secureRandomInt2);
                correctAnswer = secureRandomInt1 / secureRandomInt2;
                break;
            default:
                System.out.println("Wrong choice. Try again.");
                generateComputerInstruction(random, symbol, min, max);
        }
        return correctAnswer;
    }

    public static int validateIntInput(Scanner input) {
        boolean validInput = false;
        int response = 0;

        while (!validInput) {
            System.out.println("Please enter a number: ");
            try {
                String userInput = input.nextLine().trim();
                if (userInput.isEmpty()) System.out.println("Input cannot be empty");
                response = Integer.parseInt(userInput);
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                input.nextLine();
            }
        }
        return response;
    }
}
