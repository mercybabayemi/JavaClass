package Assignments;

import java.util.Scanner;
public class AscendingAndDescendingOrder {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int firstNumber = input.nextInt();

		System.out.println("Enter second number: ");
		int secondNumber = input.nextInt();

		System.out.println("Enter third number: ");
		int thirdNumber = input.nextInt();


		if (firstNumber > secondNumber && secondNumber > thirdNumber) {
			System.out.print("Number is in desending order");
		} else if (firstNumber < secondNumber && secondNumber < thirdNumber) {
			System.out.print("Number is in ascending order");
		} else {
			System.out.print("Number has no order");
		}
	}

}