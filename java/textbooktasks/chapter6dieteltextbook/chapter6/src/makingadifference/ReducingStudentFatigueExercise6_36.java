package makingadifference;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class ReducingStudentFatigueExercise6_36 {
    public static ComputerInstructionExercise6_35 computer;
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        Scanner input = new Scanner(System.in);
        mainMenu(random,input);

    }
    public static void mainMenu(SecureRandom random, Scanner input) {
        System.out.println("Welcome to Computer Program");
        System.out.println("Please enter a number to begin and -1 to stop the program: ");
        int userInput = computer.validateIntInput(input);
        while(userInput != -1) {
            int correctAnswer =  computer.generateComputerInstruction(random);
            confirmAnswer(correctAnswer, input);

            System.out.println("Please enter a number to begin and -1 to stop the program: ");
            userInput = computer.validateIntInput(input);
        }
        System.out.println("Bye!!");
    }

    public static void confirmAnswer(int correctAnswer,Scanner input) {
        int response = computer.validateIntInput(input);
        String[] positiveResponses = {"Very good!", "Excellent!", "Nice work!", "Keep up the good work"};
        String[] negativeResponses = {"No. Please try again.", "Wrong. Try once more", "Don't give up!", "No. Keep trying."};
        Random random = new Random();

        while(correctAnswer != response) {
            System.out.println(negativeResponses[random.nextInt(negativeResponses.length)]);
            response = computer.validateIntInput(input);
        }
        System.out.println(positiveResponses[random.nextInt(positiveResponses.length)]);
    }

}
