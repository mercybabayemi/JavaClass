
import java.util.Scanner; 
public class BmiCalculator{ 

 	public static void main(String[]args){ 

	
	Scanner input = new Scanner(System.in); 
	System.out.print("Enter your weight in pounds:"); 

	double weightInPounds = input.nextDouble(); 

	System.out.print("Enter your height in inches:");
	double heightInInches = input.nextDouble();

	double calculation = (weightInPounds * 703) / (heightInInches * heightInInches); 
 	System.out.printf("The calculated BMI value is %.1f%n", calculation); 
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
	} 

}
}