import java.util.Scanner;
public class BinaryNumber{
	public static void main(String[ ]args){
	
	Scanner input = new Scanner(System.in);
 	System.out.print("Enter an integer number: ");
 
	int number = input.nextInt();
	
	int firstNumber = number % 2;
	int secondTrial = number / 2;
	int secondNumber = secondTrial % 2;
	int thirdTrial = number / 2;
	int thirdNumber = thirdTrial / 2;

System.out.printf("%d %d %d", firstNumber, secondNumber, thirdNumber);
}
}