package ClassTaskJava.ClassTaskJennifer;

import java.util.Scanner;
public class TaxRate{
	public static void main(String[]args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter your annual income: ");
	int income = input.nextInt();
	
	if(income <= 9875){
	System.out.print("Tax rate is 10%");
	}
	else if(income >= 9876 && income <= 40125){
	System.out.print("Tax rate is 12%");
	}
	else if(income >= 40126 && income <= 85525){
	System.out.print("Tax rate is 22%");
	}
	else if(income >= 85525){
	System.out.print("Tax rate is 24%");
	}
}
}