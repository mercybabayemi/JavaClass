package ClassTaskJava.ClassTaskJennifer;

import java.util.Scanner;
public class TwoIntegers{
	public static void main(String[]args){

	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter first number:");
	double num1 = input.nextDouble();

	System.out.println("Enter second number:");
	double num2 = input.nextDouble();
	

	double multiple1 = num1 * 3;
	double multiple2 = num2 *2;

	double result = multiple1 % multiple2;

	if (result == 0) {
		System.out.println("num1 is a multiple of num2");
	}
	else {
		System.out.println("num1 is not a multiple of num2");
	}
}
}