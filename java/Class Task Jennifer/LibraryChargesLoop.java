import java.util.Scanner;
public class LibraryChargesLoop{
	public static void main( String [ ] args){
 
	Scanner input = new Scanner(System.in);
	int days;

	for(int i = 1; i <= 3; i++){
		System.out.print("Enter number of days lateness before book was returned: ");		days = input.nextInt();

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
	}
								
}
}