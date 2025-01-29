package classtaskjava.ClassTaskJennifer;

import java.util.Scanner;
public class PalindromeInteger{ 
 	public static void main(String[]args){ 	
	Scanner input = new Scanner(System.in); 

	System.out.print("Enter a number between 0 to 1000:"); 
	int number = input.nextInt(); 

	int firstNumber = number % 10; 
	int secondTrial = number / 10;

	int secondNumber = secondTrial % 10;

	int thirdNumber = number / 100; 

	System.out.printf("%d%d%d%n", firstNumber, secondNumber, thirdNumber); 

	
	if (firstNumber != thirdNumber){
		System.out.print("Integer is not a palindrome integer");
	}
 	else if (firstNumber == thirdNumber){
		System.out.print("Integer is a palindrome integer");
	} 
}
}
