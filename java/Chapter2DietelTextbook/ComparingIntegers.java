package Chapter2DietelTextbook;

import java.util.Scanner;
public class ComparingIntegers {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.println("Enter first integer: ");
	int x = input.nextInt();

	int square = x * x;

	if(x > 100 && square > 100) {
		System.out.println("Number and its square is greater than 100");
	}

	if(x == 100 && square == 100) {
		System.out.println("Number and its square is equal to 100");
	}

	if(x != 100 && square != 100) {
		System.out.println("Number and its square is not equal to 100");
	}

	if(x < 100 && square < 100) {
		System.out.println("Number and its square is less than 100");
	}

	}
}

