import java.util.Scanner;
public class PowerCalculation{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

		System.out.print("Enter base: ");
		int base = input.nextInt();
		System.out.print("Enter exponent: ");
		int exponent = input.nextInt();	
		
		int result = 1;
		for (int counter = 1; counter <= exponent; counter++){
			result *=base;	
		}
	
		System.out.printf("The base %d raised to the power of %d is %d", base, exponent, result);
	}
}