package classtaskjava.ClassTaskJennifer;

import java.util.Scanner;
public class LibraryChargesLoopSentinel{
	public static void main( String [ ] args){
 
	Scanner input = new Scanner(System.in);
	int days;
	int answer;
	do{
		System.out.println("Enter number of days lateness before book was returned: ");		
		days = input.nextInt();

		if(days <= 5){
			System.out.println("Fine is 50 paise");
		}
		else{
		if(days == 6 || days <= 10){
			System.out.println("Fine is 1 rupee");
		}
		else{
		if(days > 10){
			System.out.println("fine is 5 rupees");
		}	
		}
		}
			System.out.print("Do you wish to continue? press 1 for yes or 0 to stop: ");
			answer = input.nextInt() ;
	}while(answer == 1);
								
}
}