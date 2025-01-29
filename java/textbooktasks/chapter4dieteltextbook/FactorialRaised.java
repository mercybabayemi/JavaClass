package chapter4dieteltextbook;

import java.util.Scanner;

public class FactorialRaised{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of terms to calculate: ");

		int number = input.nextInt();

		System.out.print("Enter the numerator : ");
		
		int numerator = input.nextInt();

		double sum = 1; 
		
		for(int i = 1; i <= number; i++){
			double factorial = calculateFactorial(i);				
			System.out.printf("Sum = %.2f + %d^%d / %.2f%n", sum,numerator, i, factorial);
			sum += Math.pow(numerator,i) / factorial;
			
			System.out.printf("Sum = %.2f%n", sum);

		}

		System.out.printf("Final sum = %.2f", sum);
		
	}

	public static double calculateFactorial(int number){
		double factorial = 1.0;
		for(int i = 1; i <= number; i++){
			factorial *= i;
		}
		return factorial;
	}
}
