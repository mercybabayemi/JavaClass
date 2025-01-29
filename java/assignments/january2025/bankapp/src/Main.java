import bankservices.Account;
import bankservices.Bank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static Bank semicolonBank = new Bank();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        mainMenu(input);
    }
    public static void mainMenu(Scanner input) {
        displayPrompt();
        usersChoice(input);
    }

    public static void displayPrompt() {
        System.out.println("""
                Welcome to SemiColon Bank Plc.
                What would you like to do?
                1. Create Account.
                2. Deposit Money.
                3. Withdraw Money.
                4. Transfer Money.
                5. Check Balance.
                6. Exit.
                """);
    }

    private static void usersChoice(Scanner input) {
        int response = validateIntInput(input);
        switch(response) {
            case 1:
                createAccount(input);
                break;
            case 2:
                depositMoney(input);
                break;
//            case 3:
//                withdrawMoney();
//                break;
//            case 4:
//                transferMoney();
//                break;
//            case 5:
//                checkBalance();
//                break;
//            case 6:
//                exit();
//                break;
            default:
                System.out.println("Invalid response");
                mainMenu(input);
                break;
        }
    }

    private static void depositMoney(Scanner input) {
        System.out.println("Enter account number: ");
        int accountNumber = validateIntInput(input);

        System.out.println("Enter amount to deposit: ");
        int amount = validateIntInput(input);

        semicolonBank.deposit(accountNumber, amount);
        mainMenu(input);
    }

    private static void createAccount(Scanner input) {
        System.out.print("Enter your first name: ");
        String firstName = validateStringInput(input);

        System.out.print("Enter your last name: ");
        String lastName = validateStringInput(input);

        System.out.print("Enter your pin: ");
        String pin = validateStringInput(input);

        semicolonBank.createAccount(firstName, lastName, pin);
        System.out.println("Account created successfully!!!");
        mainMenu(input);
    }

    private static int validateIntInput(Scanner input) {
        boolean validInput = false;
        int response = 0;

        while(!validInput){
            try {
                response = input.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
            } finally {
                input.nextLine();
            }
        }
        return response;
    }

    public static String validateStringInput(Scanner input) {
        String response = "";
        boolean validInput = false;

        while (!validInput) {
            try {
                response = input.nextLine();
                if (response.trim().isEmpty()) throw new IllegalArgumentException("Input cannot be empty.");
                validInput = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. Please enter a non-empty string.");
            }
        }
        return response;
    }


}