import java.util.Scanner;

public class AllThatMatters {

    public AllThatMatters() {

    private boolean validateStatus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter status(Alive or Dead): ");
        String input = validateStringInput(sc);

        switch (input) {
            case "alive":
                return true;
                case "dead":
                    return false;
                    default:
                        return validateStatus();
        }
    }
}

    public String validateStringInput(Scanner input) {
        String response = "";
        boolean validInput = false;

        while (!validInput) {
            try {
                response = input.nextLine().trim();
                if (response.isEmpty()) throw new IllegalArgumentException("Input cannot be empty.");
                if (response.contains(" ")) throw new IllegalArgumentException("Input cannot contain consecutive spaces.");
                if (response.equalsIgnoreCase("alive")|| response.equalsIgnoreCase("dead")) validInput = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return response;
    }

    private void eat() {
        System.out.println("eating");
    }

    private void code() {
        System.out.println("coding");
    }
}

public void main() {n
}
