package assignments.chapterfour;

import java.util.Scanner;

public class Palindrome{ 
 	public static void main(String[] args){ 	
	Scanner input = new Scanner(System.in); 

	System.out.print("Enter a five digit number: "); 
	int number = input.nextInt(); 

	int counter = 1;

	while(number < number){
	System.out.print("Error message\nEnter a five digit number: "); 
	number = input.nextInt(); 
	counter ++;
	}

	int firstNumber = number / 10000;

	int secondTrial = number / 1000;
	int secondNumber = secondTrial % 10;

	int thirdTrial = number / 100;
	int thirdNumber = thirdTrial % 10;

	int fourthTrial = number / 10;
	int fourthNumber = fourthTrial % 10;

	int fifthNumber = number % 10;


	System.out.printf("%d%d%d%d%d%n", firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber); 

	
	if (firstNumber != fifthNumber && secondNumber != thirdNumber){
		System.out.print("Integer is not a palindrome integer");
	}
 	else if(firstNumber == fifthNumber && secondNumber == thirdNumber){
		System.out.print("Integer is a palindrome integer");
	} 
}
}
