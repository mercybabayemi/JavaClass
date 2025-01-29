package Assignments;

import java.util.Scanner;
public class NegativePositiveValues{
	public static void main(String [] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first number:");
	int firstNumber = input.nextInt();

	System.out.print("Enter second number:");
	int secondNumber = input.nextInt();

	System.out.print("Enter third number:");
	int thirdNumber = input.nextInt();

	System.out.print("Enter fourth number:");
	int fourthNumber = input.nextInt();

	System.out.print("Enter fifth number:");
	int fifthNumber = input.nextInt();

	int zeroInput = 0;


		if (firstNumber > zeroInput){
	System.out.printf("%d is a positive integer%n", firstNumber);
		}
		else if (firstNumber == zeroInput){
	System.out.printf("%d is a zero integer%n", firstNumber);
		}
		else if (firstNumber < zeroInput) {
	System.out.printf("%d is a negative integer%n", firstNumber);
		}



		if (secondNumber > zeroInput){
	System.out.printf("%d is a positive integer%n", secondNumber);
		}
		else if (secondNumber == zeroInput){
	System.out.printf("%d is a zero integer%n", secondNumber);
		}
		else if (secondNumber < zeroInput){
	System.out.printf("%d is a negative integer%n", secondNumber);
		}



		if (thirdNumber > zeroInput){
	System.out.printf("%d is a positive integer%n", thirdNumber);
		}
		else if (thirdNumber == zeroInput){
	System.out.printf("%d is a zero integer%n", thirdNumber);
		}
		else if (thirdNumber < zeroInput){
	System.out.printf("%d is a negative integer%n", thirdNumber);
		}



		if (fourthNumber > zeroInput){
	System.out.printf("%d is a positive integer%n",fourthNumber);
		}
		else if (fourthNumber == zeroInput){
	System.out.printf("%d is a zero integer%n", fourthNumber);
		}
		else if (fourthNumber < zeroInput){
	System.out.printf("%d is a negative integer%n", fourthNumber);
		}



		if (fifthNumber > zeroInput){
	System.out.printf("%d is a positive integer%n", fifthNumber);
		}
		else if (fifthNumber == zeroInput){
	System.out.printf("%d is a zero integer%n", fifthNumber);
		}
		else if (fifthNumber < zeroInput){
	System.out.printf("%d is a negative integer%n", fifthNumber);
		}

}
}