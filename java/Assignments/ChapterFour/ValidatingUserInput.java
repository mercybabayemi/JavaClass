package Assignments.ChapterFour;

import java.util.Scanner;
public class ValidatingUserInput{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	int number = 0;
	int counter = 1;

	while(number != 1 && number != 2){
	System.out.print("Enter a number(1 or 2 to stop): ");
	number = input.nextInt();
	counter++;
	}
}
}