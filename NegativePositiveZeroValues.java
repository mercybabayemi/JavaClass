/**Prompt user to enter five numbers, Count the numbers of positive numbers input, Count the numbers of negative numbers input, Count the numbers of zero numbers input*/

import java.util.Scanner; //import declaration helps the compiler locate the class Scanner in java predefined packages

public class NegativePositiveZeroValues{ //class declaration

 	public static void main(String[]args){ //Main method declaration

	Scanner input = new Scanner(System.in); //creates a new instance of the Scanner class that reads input from the standard input stream object.
	
	double positiveNum = 0;
	double negativeNum = 0;
	double zeroNum = 0; //declare double variables and initializes it with zero values

	int count = 0;
	while (count < 5){ //while loop is for reiteration and repetition to enter 5 numbers from the console
	System.out.print("Enter your number:"); //Prompt user on console to input
 
	double number = input.nextDouble(); //We use nextDouble() to capture inputs.
	
	if(number < 0){
	negativeNum += 1;
	}
	else if (number > 0){
	positiveNum += 1;
	}
	else {
	zeroNum += 1;
	} //nested conditional statements
	count++;
	}
	

	System.out.print("Positive number is " + positiveNum + "\n");
	System.out.print("Negative number is " + negativeNum + "\n");
	System.out.print("Zero number is " + zeroNum ); /*Display result*/
}
}
