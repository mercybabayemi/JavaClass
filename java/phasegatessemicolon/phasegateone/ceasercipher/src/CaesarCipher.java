import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        Scanner input = new Scanner(System.in);
        boolean validation = false;
        while(!validation){
            System.out.print("""
                    Choose either (1 or 2):
                    1. Encryption
                    2. Decryption
                    """);
            int choice = validateIntInput(input);
            userChoice(choice, input);
            validation = continuationDeterminer(input);
        }
    }

    public static boolean continuationDeterminer(Scanner input){
        System.out.println("""
                Do you want to continue?
                Enter Yes or NO!    
                """);
        boolean valid = false;
        String response = validateStringInput(input);

        switch (response){
            case "yes":
                valid = false;
                break;
            case "no":
                valid = true;
                System.out.println("Goodbye>>");
                break;
            default:
                System.out.println("Enter Yes or NO!");
        }
        return valid;
    }

    public static void userChoice(int choice, Scanner input){
        switch(choice){
            case 1:
                String encryptedMessage = encryptMessage(input);
                System.out.println("Encrypted Message: " + encryptedMessage);
                break;
            case 2:
                String decryptedMessage = decryptMessage(input);
                System.out.println("Decrypted Message: " + decryptedMessage);
                break;
            default:
                System.out.println("InvalidInput!!");
                mainMenu();
        }
    }

    public static String encryptMessage(Scanner input) {
        System.out.println("""
                What message do you want to encrypt?
                """);
        String message = validateStringInput(input);

        System.out.print("Enter key to shift message with(0-25): ");
        int shift = validateIntInput(input);
        while(shift > 25 || shift < 0){
            System.out.print("Enter key to shift message with(0-25): ");
            shift = validateIntInput(input);
        }
        return shiftMessage(message, shift);
    }

    public static String decryptMessage(Scanner input) {
        System.out.println("""
                What message do you want to decrypt?
                """);
        String message = validateStringInput(input);

        System.out.print("Enter key to shift message with(0-25): ");
        int shift = validateIntInput(input);
        while(shift > 25 || shift < 0){
            System.out.print("Enter key to shift message with(0-25): ");
            shift = validateIntInput(input);
        }
        return shiftMessage(message, -shift);
    }

    public static String shiftMessage(String message, int shift) {
        StringBuilder shiftedMessage = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (Character.isLetter(c)) {
                char base = (Character.isLowerCase(c)) ? 'a' : 'A';
                char shiftedChar = (char) ((c - base + shift + 26) % 26 + base);
                shiftedMessage.append(shiftedChar);
            } else {
                shiftedMessage.append(c);
            }
        }
        return shiftedMessage.toString();
    }


    public static int validateIntInput (Scanner input){
        boolean validInput = false;
        int response = 0;

        while (!validInput) {
            try {
                String userInput = input.nextLine().trim();
                if (userInput.isEmpty()) {
                    System.out.println("Input cannot be empty. Please enter a valid integer.");
                    continue;
                }
                response = Integer.parseInt(userInput);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
                input.nextLine();
            }
        }
        return response;
    }

    public static String validateStringInput (Scanner input){
        String response = "";
        boolean validInput = false;

        while (!validInput) {
            try {
                response = input.nextLine().trim();
                if (response.isEmpty()) throw new IllegalArgumentException("Input cannot be empty.");
                validInput = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return response;
    }
}