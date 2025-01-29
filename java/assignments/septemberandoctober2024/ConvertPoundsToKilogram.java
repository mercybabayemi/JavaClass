package assignments;

import java.util.Scanner;
public class ConvertPoundsToKilogram{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter pounds number:");
	double pounds = input.nextDouble();
	double kilogram = 0.454 ;
	double result = pounds*kilogram;
	System.out.printf("Result is %f", result);
}
}