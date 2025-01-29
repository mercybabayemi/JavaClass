package chapter2dieteltextbook;

import java.util.Scanner;
public class NegativePositiveZeroValues{
	public static void main(String [] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter first number:");
	int firstNumber = input.nextInt();

	System.out.println("Enter second number:");
	int secondNumber = input.nextInt();

	System.out.println("Enter third number:");
	int thirdNumber = input.nextInt();

	System.out.println("Enter fourth number:");
	int fourthNumber = input.nextInt();

	System.out.println("Enter fifth number:");
	int fifthNumber = input.nextInt();

	int zeroInput = 0;
	int positiveInput = 0;
	int negativeInput = 0;


	if (firstNumber > 0){
		positiveInput += 1;
	}
	else if (firstNumber == 0){
		zeroInput += 1;
	}
	else if (firstNumber < 0) {
		negativeInput += 1;
	}


	if (secondNumber > 0){
		positiveInput += 1;
	}
	else if (secondNumber == 0){
		zeroInput += 1;
	}
	else if (secondNumber < 0) {
		negativeInput += 1;
	}


	if (thirdNumber > 0){
		positiveInput += 1;
	}
	else if (thirdNumber == 0){
		zeroInput += 1;
	}
	else if (thirdNumber < 0) {
		negativeInput += 1;
	}


	if (fourthNumber > 0){
		positiveInput += 1;
	}
	else if (fourthNumber == 0){
		zeroInput += 1;
	}
	else if (fourthNumber < 0) {
		negativeInput += 1;
	}


	if (fifthNumber > 0){
		positiveInput += 1;
	}
	else if (fifthNumber == 0){
		zeroInput += 1;
	}
	else if (fifthNumber < 0) {
		negativeInput += 1;
	}

	System.out.printf("The number of zero input are %d%nThe number of negative input are %d%nThe number of positive input are %d", zeroInput, negativeInput, positiveInput);

}
}