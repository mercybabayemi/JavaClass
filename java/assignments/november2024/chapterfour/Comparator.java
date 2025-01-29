package assignments.chapterfour;

import java.util.Scanner;
public class Comparator{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int numberOne = input.nextInt();
	
	System.out.print("Enter second number: ");
	int numberTwo = input.nextInt();

	if(numberOne == numberTwo){
	System.out.print("0");
	}
	else if(numberOne > numberTwo){
	System.out.print("1");
	}
	else{
	System.out.print("-1");
	}
}
}