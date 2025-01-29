package chapter4dieteltextbook;

import java.util.Scanner;
public class DecryptionCryptography{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the encrypted four digit Integer: ");
		String number = input.nextLine();

		while(number.length() < 4){
			System.out.println("Enter a four digit Integer: ");
			number = input.nextLine();
		}
		
		int num = Integer.parseInt(number);

		int firstNum = num / 1000;

		int secondTrial = num % 1000;
		int secondNum = secondTrial / 100;

		int thirdTrial = num % 100;
		int thirdNum = thirdTrial / 10;

		int fourthNum = num % 10;

		System.out.printf("Decrypted integers seperated are %d %d %d %d%n", firstNum, secondNum, thirdNum, fourthNum);

		int swapedFirstNum = thirdNum ;

		int swapedSecondNum = fourthNum ;

		int swapedThirdNum = firstNum ;

		int swapedFourthNum = secondNum ;

		System.out.printf("Swapped integers are %d %d %d %d%n", swapedFirstNum, swapedSecondNum, swapedThirdNum, swapedFourthNum);

		int replacedFirstNum = (swapedFirstNum - 7 + 10) % 10;
		
		int replacedSecondNum = (swapedSecondNum - 7 + 10) % 10;
		
		int replacedThirdNum = (swapedThirdNum - 7 + 10) % 10;

		int replacedFourthNum = (swapedFourthNum - 7 + 10) % 10;

		System.out.printf("Original numbers are %d %d %d %d%n", replacedFirstNum, replacedSecondNum, replacedThirdNum, replacedFourthNum);

	}
}