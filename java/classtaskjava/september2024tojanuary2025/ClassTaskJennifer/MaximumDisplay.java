package classtaskjava.ClassTaskJennifer;

import java.util.Scanner;
public class MaximumDisplay{
	public static void main(String[ ]args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter number: ");
	int number = input.nextInt();
	
	System.out.print("Enter number: ");
	int numberOne = input.nextInt();

	System.out.print("Enter number: ");
	int numberTwo = input.nextInt();
	
	int maximum = 0;

if(number >= maximum){
	maximum += number;
	System.out.printf("The maximum number is %d%n", maximum);
}

else if(numberOne >= maximum){
	maximum += numberOne;
	System.out.printf("The maximum number is %d%n", maximum);
}

else if(numberTwo >= maximum){
	maximum += numberTwo;
	System.out.printf("The maximum number is %d%n", maximum);
}

}
}