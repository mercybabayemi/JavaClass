package makingadifference;

import java.security.SecureRandom;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class DificultyLevelsExercise6_38 {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        Scanner input = new Scanner(System.in);
        mainMenu(random,input);

    }
    public static void mainMenu(SecureRandom random, Scanner input) {
        System.out.println("Welcome to Computer Program");

        int positiveCount = 0;
        int negativeCount = 0;

        int totalCount = 10;

        while (positiveCount + negativeCount != totalCount) {
            int correctAnswer =  dificultyLevel(input, random);
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

    public static int dificultyLevel(Scanner input, SecureRandom random) {
        System.out.println("""
                What level do you want to use?
                1. Easy
                2. Intermediate
                3. Hard
                """);
        int correctAnswer =  0;

        int choice = validateIntInput(input);
        switch (choice) {
            case 1:
                correctAnswer = generateComputerInstructionEasy(random);
                break;
            case 2:
                correctAnswer = generateComputerInstructionIntermediate(random);
                break;
            case 3:
                correctAnswer = generateComputerInstructionHard(random);
                break;
            default:
                System.out.println("Wrong choice. Try again.");
                dificultyLevel(input, random);
        }

        return correctAnswer;

    }

    public static int generateComputerInstructionHard(SecureRandom random) {
        int secureRandomInt1 = random.nextInt(100);
        int secureRandomInt2 = random.nextInt(200);

        System.out.printf("How much is %d times %d%n", secureRandomInt1, secureRandomInt2);

        int correctAnswer = secureRandomInt1 * secureRandomInt2;
        return correctAnswer;
    }

    public static int generateComputerInstructionIntermediate(SecureRandom random) {
        int secureRandomInt1 = random.nextInt(50);
        int secureRandomInt2 = random.nextInt(90);

        System.out.printf("How much is %d times %d%n", secureRandomInt1, secureRandomInt2);

        int correctAnswer = secureRandomInt1 * secureRandomInt2;
        return correctAnswer;
    }

    public static int generateComputerInstructionEasy(SecureRandom random) {
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
            System.out.println("Please enter a number: ");
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
