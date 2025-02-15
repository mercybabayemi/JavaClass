import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu(){
        Scanner input = new Scanner(System.in);
        System.out.println("Which state are you from in Nigeria? ");
        String userInput = validateStringInput(input);
        GeoPoliticalZones foundZone = findStateZone(userInput);
        displayResult(foundZone, userInput);
    }

    private static void displayResult(GeoPoliticalZones foundZone,String userInput) {
        if(foundZone != null){
            System.out.println("The geo political zone for " + userInput+ " state is " + foundZone);
        }else {
            System.out.println("Matching states not found in zones. Try Again");
        }
    }


    private static GeoPoliticalZones findStateZone(String userInput) {
        for(GeoPoliticalZones zone: GeoPoliticalZones.values()){
            String[] states = zone.getStates();
            for(int i = 0; i < states.length; i++) {
                if (userInput.equalsIgnoreCase(states[i])) return zone;
            }
        }
        return null;
    }

    public static String validateStringInput(Scanner input){
        String response = "";
        boolean validInput = false;

        while (!validInput) {
            try {
                response = input.nextLine().trim();
                if (response.isEmpty()) throw new IllegalArgumentException("Input cannot be empty. Try Again");
                validInput = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        return response;
    }
}