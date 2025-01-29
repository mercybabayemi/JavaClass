package chapter4dieteltextbook;

import java.util.Scanner;
public class Factorial{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a nonnegative factorial Number: ");
		int number = input.nextInt();
		while(number < 0){
			System.out.print("Enter a nonnegative factorial Number: ");
			number = input.nextInt();

		}
		int factorial = 1;
		int count = 0; 

		while(number >= 1){
			System.out.printf("%d *",factorial);
			factorial *= number;
			System.out.printf(" %d = %d%n", number, factorial);
			number--;
		}
	
		System.out.printf("The final result is %d",factorial);	
	}
}