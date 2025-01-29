package Assignments;

import java.util.Scanner;
public class ComputeVolume{
	public static void main(String[]args){

	Scanner input = new Scanner (System.in);

	System.out.print("Enter the length of sides of the triangle:");

	double length = input.nextDouble();
	double area = ( Math.sqrt(3) / 4 ) * ( length * length );
	double volume = area * length;

	System.out.printf("Area of triangle is %f%nVolume of triangle is %f", area, volume);
}
}