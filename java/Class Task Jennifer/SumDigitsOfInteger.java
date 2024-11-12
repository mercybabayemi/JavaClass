

import java.util.Scanner; 
public class SumDigitsOfInteger{ 
 	public static void main(String[]args){ 
	
	Scanner input = new Scanner(System.in); 
	System.out.print("Enter a number between 0 to 1000:"); 

	int number = input.nextInt(); 

	int firstNumber = number % 10;  

	int secondTrial = number / 10;

	int secondNumber = secondTrial % 10;

	int thirdNumber = number / 100; 
	int sum = firstNumber + secondNumber + thirdNumber; 

	System.out.printf("Sum of all the digits in the integer is %d%n",sum); 
}
}
