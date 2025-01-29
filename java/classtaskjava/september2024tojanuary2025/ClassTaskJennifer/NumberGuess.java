package classtaskjava.ClassTaskJennifer;

import java.util.Scanner;
public class NumberGuess{
	public static void main(String [ ] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Guess a number between 1 to 100: ");
	int number = input.nextInt();

	if(number <= 49){
	System.out.print("Guessed number is too low");
	}
	else{
	if(number == 50){
	System.out.print("Guessed number is correct");
	}
	else{
	if(number <= 51 && number >= 100){
	System.out.print("Guessed number is too high");
	}
	}
	}

}
}