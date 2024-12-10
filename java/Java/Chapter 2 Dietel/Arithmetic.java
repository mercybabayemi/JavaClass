import java.util.Scanner;
public class Arithmetic {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.println("Enter first integer: ");
	int x = input.nextInt();

	System.out.println("Enter second integer: ");
	int y = input.nextInt();

	int squareOne = x * x;

	int squareTwo = y * y;

	System.out.printf("Square one is %d%n Square two is %d%n", squareOne, squareTwo);

	int squareSum = squareOne + squareTwo;

	int squareDifference = squareOne - squareTwo;

	System.out.printf("Square one and two sum is %d%nSquare one and two difference is %d", squareSum, squareDifference);

	}
}

