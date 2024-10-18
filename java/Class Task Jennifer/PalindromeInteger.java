/**Prompt user to enter a three digit integer palindrome, Divide the digit of the integer with number % 10, number /10, number / 100, Display numberS, Determine whether number is a palindrome, Display result*/

import java.util.Scanner; // import declaration helps the compiler locate the class Scanner in java predefined packages

public class PalindromeInteger{ //class declaration
 	public static void main(String[]args){ //Main method declaration
	
	Scanner input = new Scanner(System.in); //creates a new instance of the Scanner class that reads input from the standard input stream  

	System.out.print("Enter a number between 0 to 1000:"); //Prompt user on console to input

	int number = input.nextInt(); //We use nextInt() to capture inputs.


	int firstNumber = number % 10; //declares an integer variable age and initializes it with an integer value 

	int secondTrial = number / 10;

	int secondNumber = secondTrial % 10;

	int thirdNumber = number / 100; //Extracting digits of the integer while storing them as a variable

	System.out.printf("%d%d%d%n", firstNumber, secondNumber, thirdNumber); /*Display result*/

	
	if (firstNumber != thirdNumber){
		System.out.print("Integer is not a palindrome integer");
	}
 	else if (firstNumber == thirdNumber){
		System.out.print("Integer is a palindrome integer");
	} /*multiple selection statements to select condition and determine whether result displayed is a palindrome before displaying result*/
}
}
