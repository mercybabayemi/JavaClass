package Chapter4DietelTextbook;

import java.util.Scanner;
public class DecimalEquivalentOfBinary{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter a binary number in 1s or 0s: ");
	int originalBinaryNumber = input.nextInt();
	int binaryNumber = originalBinaryNumber;
	int power = 0;
	int decimalNumber = 0;
	int remainder = 0;

	while(binaryNumber != 0){
		remainder = binaryNumber % 10;
		binaryNumber = binaryNumber/10;
		decimalNumber = decimalNumber + remainder * (int) Math.pow(2, power);

		System.out.printf("remainder is %d%nBinary number is %d%nDecimal number is %d%nPower is %d%n", remainder, binaryNumber, decimalNumber, power);
		power++;
	}

	System.out.print("Binary Number: " + originalBinaryNumber + " = decimal number: " + decimalNumber);
}
}