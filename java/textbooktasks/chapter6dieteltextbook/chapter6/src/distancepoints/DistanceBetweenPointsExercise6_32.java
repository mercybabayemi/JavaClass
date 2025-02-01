package distancepoints;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DistanceBetweenPointsExercise6_32 {
    private int pointX_1, pointY_1, pointX_2, pointY_2;

    public int getPointX_1() {
        return pointX_1;
    }

    public void setPointX_1(int pointX_1) {
        this.pointX_1 = pointX_1;
    }

    public int getPointY_2() {
        return pointY_2;
    }

    public void setPointY_2(int pointY_2) {
        this.pointY_2 = pointY_2;
    }

    public int getPointX_2() {
        return pointX_2;
    }

    public void setPointX_2(int pointX_2) {
        this.pointX_2 = pointX_2;
    }

    public int getPointY_1() {
        return pointY_1;
    }

    public void setPointY_1(int pointY_1) {
        this.pointY_1 = pointY_1;
    }

    public void getPointsDisplay(Character character, int number) {
        System.out.printf("Enter the %c coordinate for point %d: ", character, number);
    }

    public int validateIntInput(Scanner input) {
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
