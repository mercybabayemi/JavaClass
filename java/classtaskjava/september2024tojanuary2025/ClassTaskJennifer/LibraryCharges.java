package classtaskjava.ClassTaskJennifer;

import java.util.Scanner;
public class LibraryCharges{
	public static void main( String [ ] args){
 
	Scanner input = new Scanner(System.in);
	System.out.print("Enter number of days lateness before book was returned ");						int days = input.nextInt();			

	if(days <= 5){
		System.out.print("Fine is 50 paise");
	}
	else{
	if(days == 6 || days <= 10){
		System.out.print("Fine is 1 rupee");
	}
	else{
	if(days > 10){
		System.out.print("fine is 5 rupees");
	}
	}
	}
								
}
}