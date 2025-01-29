package Assignments.ChapterFour;

public class FactorialRaised{

	public static void main(String[] args){
	
		int product = 1;

		int sum = 1; 
		
		char numerator = 'x';
		
		for(int i = 1; i <= 7; i++){

			sum += (( numerator *= 2)/(product *= i));

		}

		System.out.print(sum);
		
	}
}

