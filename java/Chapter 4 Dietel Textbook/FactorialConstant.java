import java.util.Scanner;

public class FactorialConstant{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of terms to calculate: ");

		int number = input.nextInt();

		double sum = 1; 
		
		for(int i = 1; i <= number; i++){
			double factorial = calculateFactorial(i);				
			System.out.printf("Sum = %.2f + 1 / %.2f%n", sum, factorial);
			sum += 1 / factorial;
			
			System.out.printf("Sum = %.2f%n", sum);

		}

		System.out.printf("Final sum = %.2f", sum);
		
	}

	public static double calculateFactorial(int number){
		double factorial = 1.0;
		for(int i = 1; i <= number; i++){
			factorial *= i;
		}
		return factorial;
	}
}
