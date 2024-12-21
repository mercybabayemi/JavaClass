import java.util.Scanner;
public class GasMileage{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int count = 0;
		while(count < 1){
			System.out.println("Enter miles driven for each trip : ");
			int milesDriven = input.nextInt();

			System.out.println("Enter gallons used for each trip : ");
			int gallonsUsed = input.nextInt();

			float milesPerGallon = (float) milesDriven / (float) gallonsUsed;
			float gallonPerMiles = (float) gallonsUsed / (float) milesDriven;
			
			System.out.printf("The calculated miles used per gallon is %.2f%n", milesPerGallon);
			System.out.printf("The calculated gallon used per miles is %.2f", gallonPerMiles);
			count++;
		}
	}
}