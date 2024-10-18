/**Prompt user to enter weight in pounds and height in inches, calculate users body mass index, display bmi categories and their values*/

import java.util.Scanner; //import declaration helps the compiler locate the class Scanner in java predefined packages

public class BmiCalculator{ //class declaration

 	public static void main(String[]args){ //Main method declaration

	
	Scanner input = new Scanner(System.in); //creates a new instance of the Scanner class that reads input from the standard input stream 

	System.out.print("Enter your weight in pounds:"); //Prompt user on console to input

	double weightInPounds = input.nextDouble(); //We use nextDouble() to capture inputs.

	System.out.print("Enter your height in inches:");
	double heightInInches = input.nextDouble();

	double calculation = (weightInPounds * 703) / (heightInInches * heightInInches); //calculate body mass index

 	System.out.printf("The calculated BMI value is %.1f%n", calculation); //display result

	if (calculation < 18.5){
		System.out.println("The BMI category is underweight");
	}
	else if (calculation >= 18.5 && calculation <= 24.9){
		System.out.println("The BMI category is normalweight");
	}
	else if (calculation >= 25.0 && calculation <= 29.9){
		System.out.println("The BMI category is overweight");
	}
	else if (calculation >= 30.0 ){
		System.out.println("The BMI category is obese");
	}
	else {
		System.out.println("The BMI category is morbidly obese"); 
	} /*multiple selection statements to select condition and determine and displaying bmi values and categories*/

}
}