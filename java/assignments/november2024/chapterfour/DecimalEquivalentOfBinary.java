package assignments.chapterfour;

import java.util.Scanner;
public class DecimalEquivalentOfBinary{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter a binary number in 1s or 0s: ");
	double originalBinaryNumber = input.nextInt();
	double binaryNumber = originalBinaryNumber;
	double power = 0;
	double decimalNumber = 0;
	double remainder = 0;
	double count = 0;

	while(binaryNumber != 0){
		remainder = binaryNumber % 10;
		binaryNumber = binaryNumber/10;
		decimalNumber = remainder * Math.pow(2, power);
		power++;
		count++;
	}

	System.out.print("Binary Number: " + originalBinaryNumber + " = decimal number: " + decimalNumber);
}
}