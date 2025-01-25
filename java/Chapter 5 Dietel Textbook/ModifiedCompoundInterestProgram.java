import java.util.Scanner;
public class ModifiedCompoundInterestProgram{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter principal amount(Just figures with no decimal point): ");
		long principal = input.nextLong();

		long principalPennies = principal * 100;

		System.out.println("Enter rate: ");
		int rate = input.nextInt();

		int ratePennies = rate * 100;

		System.out.println("Enter year: ");
		int year = input.nextInt();
		
		int resultCalculation = (int) getCalculation(principalPennies, ratePennies,year);

		int dollars = resultCalculation / 100;

		int cents = resultCalculation % 100;

		System.out.printf("%d.%d%n", dollars, cents);
	}

	public static long getCalculation(long principal, int rate, int year){
		Long result = principal;
		for(int i = 0; i < year; i++){
			result = result + (result * rate / 10000);
		}
		return result;
	}
}