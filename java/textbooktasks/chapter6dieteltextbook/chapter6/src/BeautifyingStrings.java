import java.util.Scanner;

public class BeautifyingStrings {
    public static String message;

    public BeautifyingStrings() {
        this.message = message;
    }

    public String checkFullStop(String message) {
        char newMessage = message.charAt(message.length() - 1);
        if (newMessage == '.') return message;
        else return message + '.';
    }

    public String checkCapitalize(String message) {
        String newMessage = String.valueOf(message.charAt(0));
        String customized = newMessage.toUpperCase();
        String messageBody = message.substring(1, message.length());
        String all = "";
        all += customized;
        all += messageBody;
        return all;
    }

    public String validateStringInput(Scanner input) {
        boolean valid = false;
        String message = "";

        while (!valid) {
            try{
                message = input.nextLine().trim();
                if (message.isEmpty()) throw new IllegalArgumentException("Input cannot be empty.");
                if (message.contains(" ")) throw new IllegalArgumentException("Input cannot contain consecutive spaces.");
                valid = true;
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

        return message;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a string: ");

        BeautifyingStrings strings = new BeautifyingStrings();
        String stringInput = strings.validateStringInput(input);
        String startWithCapitalString = strings.checkCapitalize(stringInput);
        String addFullStop = strings.checkFullStop(startWithCapitalString);
        System.out.println(addFullStop);
    }
}
