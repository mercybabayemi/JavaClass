package classtaskjava.ClassTaskJennifer;
//grouptask1

import java.util.Scanner;
public class Maximum{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first number: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter second number: ");
	int secondNumber = input.nextInt();

	System.out.print("Enter third number: ");
	int thirdNumber = input.nextInt();

	System.out.print("Enter fourth number: ");
	int fourthNumber = input.nextInt();

	if(firstNumber > secondNumber && firstNumber > thirdNumber && firstNumber > fourthNumber){
	 	System.out.println("First number is the maximum value");
	}
	if(secondNumber > firstNumber && secondNumber > thirdNumber && secondNumber > fourthNumber){
	 	System.out.println("Second number is the maximum value");
	}
	if(thirdNumber > firstNumber && thirdNumber > secondNumber && thirdNumber > fourthNumber){
	 	System.out.println("Third number is the maximum value");
	}
	if(fourthNumber > firstNumber && fourthNumber > thirdNumber && fourthNumber > secondNumber){
	 	System.out.println("Fourth number is the maximum value");
	}



	}
}