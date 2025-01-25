package ClassTaskJava;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
public class MathQuizGame{
	static String[] symbol = {"+","-","*"};
	static boolean validating = true;
	public static int getRandomOne(){
		Random random = new Random();

		int random1 = random.nextInt(1,11);
		
		return random1;
	}

	public static int getRandomTwo(){
		Random random = new Random();

		int random1 = random.nextInt(1,11);
		
		return random1;
	}

	public static String getRandomSymbol(String[] symbol){
		Random random = new Random();

		String randomSymbol = symbol[random.nextInt(symbol.length)];
		
		return randomSymbol;
	}
	
	public static int getValidIntInput(Scanner input){
		int response = 0;
		boolean validInput = false;

		while (!validInput) {
			try {
				response = input.nextInt();
				validInput = true;
			} catch(InputMismatchException e){
				System.out.println("Invalid input. Please enter an integer.");
				input.nextLine();
			}
		}
		return response;
	}

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		for(int i = 0; i < 5; i ++){
			int random1 = getRandomOne();

			int random2 = getRandomTwo();

			String randomSymbol = getRandomSymbol(symbol);

			System.out.printf("What is %d %s %d%n", random1, randomSymbol, random2);
			int response = getValidIntInput(input);

			int result = 0;

			if(randomSymbol.equals(symbol[0])){
				result = random1 + random2;
			}else if(randomSymbol.equals(symbol[1])){
				result = random1 - random2;
			}else if(randomSymbol.equals(symbol[2])){
				result = random1 * random2;
			}

			
			if(response == result){
 				System.out.println("Correct!");
			}else{
				System.out.printf("Wrong%nThe correct answer is %d%n", result);
			}
		
		}
	}
}