package assignments;

import java.util.Scanner;
public class SumOfEvenNumbers{
	public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a lower number: ");
	int firstNumber = input.nextInt();
	
	System.out.print("Enter a higher number: ");
	int secondNumber = input.nextInt();

	int counter = 1;
	
	while(firstNumber > secondNumber){
		System.out.print("Renter a higher number: ");
		secondNumber = input.nextInt();
		counter++;
	}

	int firstNumberSum = 0;
	int secondNumberSum = 0;

	for(int index = 2; index < secondNumber; index += 2 ){
	if(firstNumber % 2 == 0 && secondNumber % 2 == 0){
		firstNumberSum += index;
		secondNumberSum += index;
	}
	}
	System.out.println("Total of first Number sum is " + firstNumberSum );
	System.out.println("Total of second Number sum is " + secondNumberSum);


	
}
}