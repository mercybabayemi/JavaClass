package assignments.compoundinterestcalculator;

import java.util.Scanner;
public class CompoundInterestCalculator{
	private static final double PERCENTAGE = 100.0;
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double initialInvestment = getInitialInvestment(input);
		
		int monthlyContribution = getMonthlyContribution(input);

		int lengthOfTimeInYears = getLengthOfTimeInYears(input);

		double estimatedAnnualInterestRate = getEstimatedAnnualInterestRate(input);
		
		double interestRateVarianceRange = getInterestVarianceRange(input);

		int compoundFrequency = getCompoundFrequency(input);

		int totalPeriods = lengthOfTimeInYears * compoundFrequency;

		System.out.printf("The calculated compound interest with the entered estimated annual rate is : %.2f%n", getCompoundedInterestBalance( initialInvestment, totalPeriods, estimatedAnnualInterestRate, compoundFrequency, monthlyContribution));

		System.out.printf("The calculated compound interest with a reduced interest variance range is : %.2f%n", getDeductedCompoundedInterestBalance( initialInvestment, totalPeriods, estimatedAnnualInterestRate, compoundFrequency, monthlyContribution, interestRateVarianceRange));

		System.out.printf("The calculated compound interest with an increased interest variance range is : %.2f%n", getAddedCompoundedInterestBalance( initialInvestment, totalPeriods, estimatedAnnualInterestRate, compoundFrequency, monthlyContribution, interestRateVarianceRange));

	}
	public static double getInitialInvestment(Scanner input){
		System.out.println("Enter the amount of money that you have available to invest initially: ");
		double initialInvestment = input.nextDouble();
		return initialInvestment;
	}

	public static int getMonthlyContribution(Scanner input){
		System.out.println("Enter amount that you plan to add to the principal every month or a negative number for the amount that you plan to withdraw every month: ");
		int monthlyContribution = input.nextInt();
		return monthlyContribution;
	}

	public static int getLengthOfTimeInYears(Scanner input){
		System.out.println("Enter length of time in years that you plan to save: ");
		int lengthOfTimeInYears = input.nextInt();
		return lengthOfTimeInYears;

	}

	public static double getEstimatedAnnualInterestRate(Scanner input){
		System.out.println("Enter your estimated annual interest rate: ");
		double estimatedAnnualInterestRate = input.nextDouble();
		estimatedAnnualInterestRate /= PERCENTAGE;
		return estimatedAnnualInterestRate;
	}

	public static double getInterestVarianceRange(Scanner input){
		System.out.println("Enter range of interest rates(above and below the rates set above) that you desire to see results for: ");
		double interestRateVarianceRange = input.nextDouble();
		interestRateVarianceRange /= PERCENTAGE;
		return interestRateVarianceRange;
	}
	
	public static int getCompoundFrequency(Scanner input){
		int compoundFrequency = 0;
		while(compoundFrequency == 0){
			System.out.println("Enter times per year that interest will be compounded: \n1. Annually \n2. Semiannually \n3. Quarterly \n4. Monthly \n5. Daily");
			int compoundFrequencyResponse = input.nextInt();
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
					compoundFrequency = 365;
					break;
				default:
					System.out.print("Invalid input, enter a valid number: ");
			}
		}
		return compoundFrequency;
	}

	public static double getCompoundedInterestBalance(double initialInvestment, int totalPeriods, double estimatedAnnualInterestRate, int compoundFrequency, int monthlyContribution){
		double balance = initialInvestment;
		double monthlyInterestRate = estimatedAnnualInterestRate / compoundFrequency;
		for(int each = 1; each <= totalPeriods; each++){
			balance += balance * monthlyInterestRate;
			if(monthlyContribution > 0){
				balance += monthlyContribution;
			}else{
				balance -= monthlyContribution;
			}
		}
		return balance;
	}

	public static double getDeductedCompoundedInterestBalance(double initialInvestment, int totalPeriods, double estimatedAnnualInterestRate, int compoundFrequency, int monthlyContribution,double interestRateVarianceRange){
		double balance = initialInvestment;
		double newRate = estimatedAnnualInterestRate - interestRateVarianceRange;
		double monthlyInterestRate = newRate / compoundFrequency;
		for(int each = 1; each <= totalPeriods; each++){
			balance += balance * monthlyInterestRate;
			if(monthlyContribution > 0){
				balance += monthlyContribution;
			}else{
				balance -= monthlyContribution;
			}
		}
		return balance;
	}

	public static double getAddedCompoundedInterestBalance(double initialInvestment, int totalPeriods, double estimatedAnnualInterestRate, int compoundFrequency, int monthlyContribution,double interestRateVarianceRange){
		double balance = initialInvestment;
		double newRate = estimatedAnnualInterestRate + interestRateVarianceRange;
		double monthlyInterestRate = newRate / compoundFrequency;
		for(int each = 1; each <= totalPeriods; each++){
			balance += balance * monthlyInterestRate;
			if(monthlyContribution > 0){
				balance += monthlyContribution;
			}else{
				balance -= monthlyContribution;
			}
		}
		return balance;
	}
}