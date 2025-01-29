package classtaskjava.ClassTaskJennifer;

import java.util.Scanner;
public class FinancialApplication{
	public static void main(String[ ]arg){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter investment amount: ");
	double investmentAmount = input.nextDouble();

	System.out.print("Enter annual interest rate: ");
	double annualInterest = input.nextDouble();
	double annualInterestRate = annualInterest / 100;

	System.out.print("Enter number of years: ");
	double years = input.nextDouble();
	
 	double monthlyInterestRate = annualInterestRate / 12;

	double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), (years*12));

System.out.printf("The future investment value is %.2f", futureInvestmentValue);
}
}