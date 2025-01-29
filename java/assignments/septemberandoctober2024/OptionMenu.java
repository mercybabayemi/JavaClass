package assignments;

import java.util.Scanner;
public class OptionMenu{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int response = 0;
	
	int counter = 1;

	do {
		System.out.println("Enter a Menu Option:\n1. Add\n2. View\n3. Delete\n4. Quit");
		response = input.nextInt();
	
		switch(response){
			case 1: System.out.println("1. Add");
			break;
			case 2: System.out.println("2. View");
			break;
			case 3: System.out.println("3. Delete");
			break;
			case 4: System.out.println("4. Quit");
			break;
		}
	
	} while (response != 0);
	

	
}
}

