package assignments.chapterfour;

import java.util.Scanner;
public class Factorial{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter factorial Number: ");
	int number = input.nextInt();
	int factorial = 1;
	int count = 0; 

	while(number >= 1){
		factorial *= number;
		number--;
		count++;
	}
	
	System.out.print(factorial);	
}
}