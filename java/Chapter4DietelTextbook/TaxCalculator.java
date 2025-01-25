package Chapter4DietelTextbook;

import java.util.Scanner;
public class TaxCalculator{
	public static void main(String[ ]args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter first citizen's earning: ");
	int firstCitizenEarning = input.nextInt();
	
	System.out.println("Enter first citizen's name: ");
	String firstCitizenName = input.next();

	System.out.println("Enter second citizen's earning: ");
	int secondCitizenEarning = input.nextInt();
	
	System.out.println("Enter second citizen's name: ");
	String secondCitizenName = input.next();

	System.out.println("Enter third citizen's earning: ");
	int thirdCitizenEarning = input.nextInt();
	
	System.out.println("Enter third citizen's name: ");
	String thirdCitizenName = input.next();

	double taxRate = 0.0;
	double firstTotalTax= 0.0;
	double secondTotalTax = 0.0;
	double thirdTotalTax = 0.0;

	if(firstCitizenEarning <= 30000){
		taxRate = 15.0 / 100;
		firstTotalTax = firstCitizenEarning * taxRate;
		System.out.println(firstCitizenName + " earning of " + firstCitizenEarning + " total tax is " + firstTotalTax );
	}
	else if(firstCitizenEarning > 30000){
		taxRate = 20.0 / 100;
		firstTotalTax = firstCitizenEarning * taxRate;
		System.out.println(firstCitizenName + " earning of " + firstCitizenEarning + " total tax is " + firstTotalTax );
	}

	if( secondCitizenEarning <= 30000){
		taxRate = 15.0 / 100;
		secondTotalTax = secondCitizenEarning * taxRate;
	System.out.println(secondCitizenName + " earning of " + secondCitizenEarning + " total tax is " + secondTotalTax );
	}	
	else if( secondCitizenEarning > 30000){
		taxRate = 20.0 / 100;
		secondTotalTax = secondCitizenEarning * taxRate;
	System.out.println(secondCitizenName + " earning of " + secondCitizenEarning + " total tax is " + secondTotalTax );
	}

	if(thirdCitizenEarning <= 30000){
		taxRate = 15.0 / 100;
		thirdTotalTax = thirdCitizenEarning * taxRate;
		System.out.println(thirdCitizenName + " earning of " + thirdCitizenEarning + " total tax is " + thirdTotalTax );
	}
	else if( thirdCitizenEarning > 30000){
		taxRate = 20.0 / 100;
		thirdTotalTax = thirdCitizenEarning * taxRate;
		System.out.println(thirdCitizenName + " earning of " + thirdCitizenEarning + " total tax is " + thirdTotalTax );
	}
}
}