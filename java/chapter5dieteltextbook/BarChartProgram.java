package Chapter5DietelTextbook;

import java.util.Scanner;
public class BarChartProgram{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("How many symbol would you like to print? ");
		int number = input.nextInt();
		input.nextLine();

		System.out.println("What symbol would you like to print? ");
		String symbol = input.nextLine();

		printSymbol(number, symbol);
	}
	
	public static void printSymbol(int number, String symbol){
		for(int count = 1; count <= number; count++){
			System.out.print(symbol);
		}

	}
}