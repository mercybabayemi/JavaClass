package assignments;

import java.util.Scanner;
public class CalculateInterest{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter balance:");
	double balance = input.nextDouble();

	System.out.print("Enter annual percentage interest rate:");
	double  interestRate = input.nextDouble();

	double  calculationFigure = 1200;
	double interest = balance * (interestRate / 1200);

	System.out.printf("Interest for the next month is %.2f", interest);
}
}