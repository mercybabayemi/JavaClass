package ClassTaskJava.ClassTaskJennifer;

import java.util.Scanner;
public class EligibleAge{
	public static void main(String[]args){
	
	Scanner input = new Scanner(System.in);

	System.out.println("Enter your age; ");
	int age = input.nextInt();

	if(age < 16){
	System.out.print("You are not eligible to drink, drive or vote");
	}
	else if(age >= 16){
	System.out.print("You can drive");
	}
	else if(age >= 18){
	System.out.print("You can vote");
	}
	else if(age >= 21){
	System.out.print("You can drink");
	}

	
}
}