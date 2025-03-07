import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = input.nextInt();
        int addition = firstNumber + secondNumber;
        int result1 = addition - firstNumber;
        int result2 = addition- secondNumber;
        System.out.printf("%d, %d", result1, result2);
    }
}