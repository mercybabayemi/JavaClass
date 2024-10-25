import java.util.Scanner;
public class RunwayLength{
	public static void main (String[ ]args){
Scanner input = new Scanner(System.in);
	
	System.out.print("Enter takeoff speed in meter/second: ");
	double takeOffSpeed = input.nextDouble();

	System.out.print("Enter acceleration in meter/second squared: ");
	double acceleration = input.nextDouble();
 

	double minimumRunwayLength = (Math.pow(takeOffSpeed,2)) / (acceleration * acceleration);

	System.out.printf("The minimum runway length is %f",minimumRunwayLength);
}
}

