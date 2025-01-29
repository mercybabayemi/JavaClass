package Chapter2DietelTextbook;

import java.util.Scanner;
public class Multiples{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first integer: ");
		int number1 = input.nextInt();
		
		System.out.println("Enter second integer: ");
		int number2 = input.nextInt();

		int firstTripled = number1 * number1 * number1;
		int secondDoubled = number2 * number2 ;

		if (secondDoubled % firstTripled == 0) {
			System.out.print("first number tripled is a multiple of second number doubled");
		}
		else {
			System.out.print("first number tripled is not a multiple of second number doubled");
		}

		}
}