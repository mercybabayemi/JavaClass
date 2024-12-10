import java.util.Scanner;
public class SeparatingDigit{
	public static void main(String[] args){
	
		Scanner input = new Scanner(System);
		
		System.out.print("Enter a  five digits integer: ");
		int digit = input.nextInt();

		int firstNumber = digit / 10000;
		
		int secondTrial = digits / 1000;
		int secondNumber = secondTrial % 10;

		int thirdTrial = digits / 100;
		int thirdNumber = thirdTrial % 10;
		
		int fourthTrial = digits / 10;
		int fourthNumber = fourthTrial % 10;

		int fifthNumber = digits % 10;

		System.out.printf("%d %d %d %d %d", firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber);
	}
}