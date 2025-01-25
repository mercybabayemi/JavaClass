package ClassTaskJava.ClassTaskJennifer;

import java.util.Scanner;
public class NumberGuessLoop{
	public static void main(String [ ] args){
	
	Scanner input = new Scanner(System.in);
	int number;
	int answer;
	do{
		System.out.print("Guess a number between 1 to 100: ");
		number = input.nextInt();

		if(number <= 49){
			System.out.println("Guessed number is too low");
		}
		else{
		if(number == 50){
			System.out.println("Guessed number is correct");
		}
		else{
		if(number <= 51 || number <= 100){
			System.out.println("Guessed number is too high");
		}
		}
		}
			answer = 50;
			if( number == answer){
				break;
			}
	}while(answer == 50);

}
}