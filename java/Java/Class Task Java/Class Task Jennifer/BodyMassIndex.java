import java.util.Scanner;
public class BodyMassIndex{
	public static void main (String[ ]args){
Scanner input = new Scanner(System.in);
	
	System.out.print("Enter weight in pounds: ");
	double weight = input.nextDouble();
	double weightKg = weight * 0.45359237;

	System.out.print("Enter height in inches: ");
	double height = input.nextDouble();
	double heightMeter = height * 0.0254;

 	double bmi = weightKg / Math.pow(heightMeter,2);

System.out.printf("The body mass index calculated is %.2f", bmi);

}
}
 
