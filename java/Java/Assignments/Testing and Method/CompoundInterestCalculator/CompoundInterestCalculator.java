import java.util.Scanner;
public class CompoundInterestCalculator{
	private static final double PERCENTAGE = 100.0;
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of money that you have available to invest initially: ");
		long initialInvestment = input.nextLong();
		System.out.println("Enter amount that you plan to add to the principal every month or a negative number for the amount that you plan to withdraw every month: ");
		int monthlyContribution = input.nextInt();
		System.out.println("Enter length of time in years that you plan to save: ");
		int lengthOfTimeInYears = input.nextInt();
		System.out.println("Enter your estimated annual interest rate: ");
		double estimatedAnnualInterestRate = input.nextDouble();
		estimatedAnnualInterestRate /= PERCENTAGE;
		
		double interestRateVarianceRange = getInterestVarianceRange(input);

		int compoundFrequency = getCompoundFrequency(input);
	}

	public static double getInterestVarianceRange(Scanner input){
		System.out.println("Enter range of interest rates(above and below the rates set above) that you desire to see results for: ");
		double interestRateVarianceRange = input.nextDouble();
		interestRateVarianceRange /= PERCENTAGE;
		return interestRateVarianceRange;
	}
	
	public static int getCompoundFrequency(Scanner input){
		System.out.println("Enter times per year that interest will be compounded: \n1. Annually \n2. Semiannually \n3. Quarterly \n4. Monthly \n5. Daily");
		int compoundFrequencyResponse = input.nextInt();
		int compoundFrequency = 0;
		switch(compoundFrequencyResponse){
			case 1:
				compoundFrequency = 1;
				break;
			case 2:
				compoundFrequency = 2;
				break;
			case 3:
				compoundFrequency = 4;
				break;
			case 4:
				compoundFrequency = 12;
				break;
			case 5:
				compoundFrequency = 1;
				break;
			default:
				System.out.print("Invalid input, enter a valid number: ");
				compoundFrequencyResponse = getCompoundFrequency(input);
		}
		return compoundFrequency;
	}
}