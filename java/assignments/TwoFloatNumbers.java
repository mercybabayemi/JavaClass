package Assignments;

import java.util.Scanner;
public class TwoFloatNumbers{
	public static void main(String[ ]args){
	
	Scanner input = new Scanner(System.in);
	
	
	System.out.print("Enter first float: ");
	double firstUserInput = input.nextDouble();

	System.out.print("Enter second float: ");
	double secondUserInput = input.nextDouble();

if(firstUserInput == secondUserInput){
	System.out.print("They are the same");
}
else{
	System.out.print("They are different");
	}
}
}
