package crapgame;

import java.security.SecureRandom;
import java.util.InputMismatchException;
import java.util.Scanner;


public class CrapsModificationExercise6_33 {

    private static int bankBalance = 1000;

    private static Craps.Status gameStatus;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        mainMenu(input);
    }

    public static void mainMenu(Scanner input) {
        System.out.println("""
                Shall we start the game?
                Press any key to start the game.
                Press -1 to exit the game.
                """);

        int gamesRunner = validateIntInput(input);

        while (gamesRunner != -1) {
            int wager = wager(input);

            gameStatus = runGame();

            if (gameStatus == Craps.Status.WON){
                bankBalance = bankBalance + wager;
                System.out.println("Player wins!\nBank Balance: " + bankBalance);
            }else if (gameStatus == Craps.Status.LOST){
                bankBalance = bankBalance - wager;
                System.out.println("Player loses!\nBank Balance: " + bankBalance);
            }

            if (bankBalance == 0){
                System.out.println("You are busted!\n You are out of money!");
                break;
            }

            chatter();

            System.out.println("""
                    Do you want to continue?
                    Press any key to start the game.
                    Press -1 to exit the game.
                    """);

            gamesRunner = validateIntInput(input);
        }

        if(gamesRunner == -1){
            System.out.println("Bye!!");
        }
    }

    public static void chatter() {
        String[] winningMessage = {"Now's the time to cash in your chips!", "You're up big"};
        String[] losingMessage = {"0h! You're going broke, huh?","Aw c'mon, take a chance!"};

        SecureRandom randomNumbers = new SecureRandom();

        if (gameStatus == Craps.Status.WON){
            int choice = randomNumbers.nextInt(winningMessage.length);
            System.out.println(winningMessage[choice]);
        }
        else if (gameStatus == Craps.Status.LOST){
            int choice = randomNumbers.nextInt(losingMessage.length);
            System.out.println(losingMessage[choice]);
        }
    }

    public static int wager(Scanner input) {
        System.out.print("Enter a wager: ");
        int wager = validateIntInput(input);

        while(wager <= 0 || wager > bankBalance) {
            System.out.println("Wager must be greater than 0 and less than or equal to " + bankBalance);
            wager = validateIntInput(input);
        }
        return wager;
    }

    public static Craps.Status runGame(){
        int myPoint = 0;
        int sumOfDice = Craps.rollDice();

        gameStatus = gameStatusDecision(sumOfDice, myPoint);

        if (gameStatus == Craps.Status.CONTINUE) {
            myPoint = sumOfDice;
            winOrLossOrContinueDecision(sumOfDice, myPoint);
        }

        return gameStatus;

    }

    public static void winOrLossOrContinueDecision(int sumOfDice, int myPoint){
        while (gameStatus == Craps.Status.CONTINUE) {
            sumOfDice = Craps.rollDice();
            if(sumOfDice == myPoint){
                gameStatus = Craps.Status.WON;
            }else if (sumOfDice == Craps.SEVEN){
                gameStatus = Craps.Status.LOST;
            }
        }
    }

    public static Craps.Status gameStatusDecision(int sumOfDice, int myPoint){
        switch (sumOfDice) {
            case Craps.SEVEN:
            case Craps.YO_LEVEN:
                gameStatus = Craps.Status.WON;
                break;
            case Craps.SNAKE_EYES:
            case Craps.TREY:
            case Craps.BOX_CARS:
                gameStatus = Craps.Status.LOST;
                break;
            default:
                gameStatus = Craps.Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is %d%n", myPoint);
                break;
        }
        return gameStatus;
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
            }catch (NumberFormatException e){
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
        return response;
    }
}
