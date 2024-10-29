import java.util.Scanner;
public class EvenAndOddNumberLoopSentinel{
	public static void main(String [ ] args){
	
	Scanner input = new Scanner(System.in);
	int answer;

do{
	System.out.print("Enter number: ");

	int number = input.nextInt();

		if(number % 2 == 0 ){
			System.out.println("Number is an even number");
		}
		else{
			System.out.println("Number is an odd number");
		}
			System.out.print("Do you want to continue? Enter 1 for (yes) to continue or 0 for (no) to break");
			answer = input.nextInt();

}while(answer == 1);

}
}