package ClassTaskJava.ClassTaskJennifer;

import java.util.Scanner;
public class Number{
	public static void main(String[]args){
 
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a whole number: ");
	int wholeNumbers = input.nextInt();

	System.out.print("Enter a decimal point number: ");
	float floatNumbers = input.nextFloat();
	
	System.out.print("Enter a decimal point number: ");
	double doubleNumbers = input.nextDouble();

	double sum = wholeNumbers + floatNumbers + doubleNumbers;

	System.out.printf("The sum is %.2f", sum);

}
}
