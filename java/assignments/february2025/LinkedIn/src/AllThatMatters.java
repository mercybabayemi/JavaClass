import java.util.Scanner;

public class AllThatMatters {

    public static void main(String[] args) {
        boolean isAlive = validateStatus();
        while (isAlive) {
            eat();
            code();
            isAlive = validateStatus();
        }
    }

    private static boolean validateStatus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter status (Alive or Dead): ");
        String status = validateStringInput(sc);
        status = status.toLowerCase();

        switch (status) {
            case "alive":
                return true;
            case "dead":
                return false;
            default:
                System.out.println("Invalid status. Please enter 'Alive' or 'Dead'.");
                return validateStatus();  // Recurse if the input is invalid
        }
    }

    private static String validateStringInput(Scanner input) {
        String response = "";
        boolean validInput = false;

        while (!validInput) {
            try {
                response = input.nextLine().trim();
                if (response.isEmpty()) {
                    throw new IllegalArgumentException("Input cannot be empty.");
                }
                if (response.contains(" ")) {
                    throw new IllegalArgumentException("Input cannot contain consecutive spaces.");
                }

                if (response.equalsIgnoreCase("alive") || response.equalsIgnoreCase("dead")) {
                    validInput = true;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return response;
    }

    private static void eat() {
        System.out.println("Eating");
    }

    private static void code() {
        System.out.println("Coding");
    }
}

