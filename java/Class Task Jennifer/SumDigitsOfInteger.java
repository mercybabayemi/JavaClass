/**Prompt user to enter a number between 0 to 1000, Extract the digit of the integer with number % 10, number /10, number / 100, Sum the digits in the results, Display result */

import java.util.Scanner; //import declaration helps the compiler locate the class Scanner in java predefined packages

public class SumDigitsOfInteger{ //class declaration
 	public static void main(String[]args){ //Main method declaration

	
	Scanner input = new Scanner(System.in); //creates a new instance of the Scanner class that reads input from the standard input stream 

	System.out.print("Enter a number between 0 to 1000:"); //Prompt user on console to input

	int number = input.nextInt(); //We use nextInt() to capture inputs.

	int firstNumber = number % 10; //declares an integer variable and initializes it with an integer value 

	int secondTrial = number / 10;

	int secondNumber = secondTrial % 10;

	int thirdNumber = number / 100; //Extracting digits of the integer while storing them as a variable

	int sum = firstNumber + secondNumber + thirdNumber; //Sum of integers

	System.out.printf("Sum of all the digits in the integer is %d%n",sum); /*Display result*/
}
}
