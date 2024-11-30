import java.util.Scanner;
public class MultipleNumberLoopSentinel{
	public static void main(String [ ] args){
	
	Scanner input = new Scanner(System.in);
	int answer;

do{
	System.out.print("Enter number: ");

	int number = input.nextInt();

		if(number % 5 == 0){
				System.out.println("Number is a multiple of 5");
			}
			else{
				System.out.println("Number is not a multiple of 5");
			}

			System.out.print("Do you want to continue? Enter 1 for (yes) to continue or 0 for (no) to break: ");
			answer = input.nextInt();

}while(answer == 1);

}
}