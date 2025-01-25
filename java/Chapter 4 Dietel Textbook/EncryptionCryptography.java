import java.util.Scanner;
public class EncryptionCryptography{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a four digit Integer: ");
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

		System.out.printf("Numbers seperated are %d %d %d %d%n", firstNum, secondNum, thirdNum, fourthNum); 

		int replacedFirstNum = (firstNum + 7) % 10;
		
		int replacedSecondNum = (secondNum + 7) % 10;
		
		int replacedThirdNum = (thirdNum + 7) % 10;

		int replacedFourthNum = (fourthNum + 7) % 10;

		System.out.printf("Numbers replaced are %d %d %d %d%n", replacedFirstNum, replacedSecondNum, replacedThirdNum, replacedFourthNum);

		int swapedFirstNum = replacedThirdNum ;

		int swapedSecondNum = replacedFourthNum ;

		int swapedThirdNum = replacedFirstNum ;

		int swapedFourthNum = replacedSecondNum ;

		System.out.printf("Encrypted integers are %d %d %d %d%n", swapedFirstNum, swapedSecondNum, swapedThirdNum, swapedFourthNum);
	}
}