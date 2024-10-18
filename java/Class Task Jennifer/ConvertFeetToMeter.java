/**Prompt user to enter number in foot, Convert foot number to meter with 0.305, Display result*/

import java.util.Scanner; //import declaration helps the compiler locate the class Scanner in java predefined packages

public class ConvertFeetToMeter{ //class declaration
	public static void main(String[]args){ //Main method declaration
	
	Scanner input = new Scanner(System.in); //creates a new instance of the Scanner class that reads input from the standard input stream object

	System.out.print("Enter foot number:"); //Prompt user on console to input
	double footNumber = input.nextDouble(); //We use nextDouble() to capture inputs.
	

	double meterConverter = 0.305;  //declares a double variable and initializes it with a value 

	double meterNumber = footNumber * meterConverter; //multiplication of variables
	
	System.out.printf("Meternumber is %f%n", meterNumber); /*Display result*/
}
} 