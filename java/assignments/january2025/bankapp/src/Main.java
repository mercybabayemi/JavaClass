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
            case 3:
                withdrawMoney(input);
                break;
            case 4:
                transferMoney(input);
                break;
            case 5:
                checkBalance(input);
                break;
            case 6:
                exit();
                break;
            default:
                System.out.println("Invalid response");
                mainMenu(input);
                break;
        }
    }

    private static void exit() {
        System.out.println("Goodbye!");
    }

    public static void checkBalance(Scanner input) {
        try {
            System.out.println("Enter account number: ");
            int accountNumber = validateIntInput(input);

            System.out.print("Enter your pin: ");
            String pin = validateStringInput(input);

            int balance = semicolonBank.checkBalance(accountNumber, pin);
            System.out.println("Your balance is: " + balance);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occured: " + e.getMessage());
        }
        mainMenu(input);
    }

    private static void transferMoney(Scanner input) {
        try {
            System.out.println("Enter  sender's account number: ");
            int senderAccount = validateIntInput(input);

            System.out.println("Enter  receiver's account number: ");
            int receiverAccount = validateIntInput(input);

            System.out.println("Enter amount to withdraw: ");
            int amount = validateIntInput(input);

            System.out.print("Enter your pin: ");
            String pin = validateStringInput(input);

            semicolonBank.transfer(senderAccount, receiverAccount, amount, pin);
            System.out.println("Amount has been withdrawn successfully.");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occured: " + e.getMessage());
        }

        mainMenu(input);
    }

    private static void withdrawMoney(Scanner input) {
        try{
            System.out.println("Enter account number: ");
            int accountNumber = validateIntInput(input);

            System.out.println("Enter amount to withdraw: ");
            int amount = validateIntInput(input);

            System.out.print("Enter your pin: ");
            String pin = validateStringInput(input);

            semicolonBank.withdraw(accountNumber, amount, pin);
            System.out.println("Amount has been withdrawn successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println("An unexpected error occured: " + e.getMessage());
        }

        mainMenu(input);
    }

    private static void depositMoney(Scanner input) {

        try {
            System.out.println("Enter account number: ");
            int accountNumber = validateIntInput(input);

            System.out.println("Enter amount to deposit: ");
            int amount = validateIntInput(input);

            semicolonBank.deposit(accountNumber, amount);
            System.out.println("Deposit successful!!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (Exception e) {
            System.out.println("An unexpected error occured: " + e.getMessage());
        }

        mainMenu(input);
    }

    private static void createAccount(Scanner input) {
        System.out.print("Enter your first name: ");
        String firstName = validateStringInput(input);

        System.out.print("Enter your last name: ");
        String lastName = validateStringInput(input);

        System.out.print("Enter your pin: ");
        String pin = validateStringInput(input);

        int accountNumber = semicolonBank.createAccount(firstName, lastName, pin);
        System.out.println("Account created successfully!!!");

        System.out.printf("Your account number is %d%n", accountNumber);
        mainMenu(input);
    }

    private static int validateIntInput(Scanner input) {
        boolean validInput = false;
        int response = 0;

        while(!validInput){
            try {
                String userInput = input.nextLine().trim();
                if (userInput.isEmpty()) System.out.println("Input cannot be empty. Please enter a valid integer.");
                response = Integer.parseInt(userInput);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
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
                response = input.nextLine().trim();
                if (response.isEmpty()) throw new IllegalArgumentException("Input cannot be empty.");
                if (response.contains(" ")) throw new IllegalArgumentException("Input cannot contain consecutive spaces.");
                validInput = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return response;
    }


}