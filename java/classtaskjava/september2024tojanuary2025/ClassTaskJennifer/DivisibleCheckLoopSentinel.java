package classtaskjava.ClassTaskJennifer;

import java.util.Scanner;
public class DivisibleCheckLoopSentinel{
	public static void main(String [ ] args){
	
	Scanner input = new Scanner(System.in);
	int answer;

do{
	System.out.print("Enter number: ");

	int number = input.nextInt();

	if(number % 5 == 0 && number % 11 == 0){
		System.out.println("Number is divisible by 11 and 5");
	 }
	else{
	System.out.println("Number is not divisible by 11 and 5");
	}

	System.out.print("Do you want to continue? Enter 1 for (yes) to continue or 0 for (no) to break");
	answer = input.nextInt();

}while(answer == 1);

}
}