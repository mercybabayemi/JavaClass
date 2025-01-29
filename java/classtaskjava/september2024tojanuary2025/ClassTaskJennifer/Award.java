package classtaskjava.ClassTaskJennifer;

import java.util.Scanner;
public class Award{
	public static void main(String[]args){
	
	Scanner input = new Scanner(System.in);

	System.out.println("Enter number between 1 to 4: ");
	int number = input.nextInt();

	switch(number){
	case 1: System.out.print("Gold Medal");
	break;
	case 2: System.out.print("Silver Medal");
	break;
	case 3: System.out.print("Bronze Medal");
	break;
	case 4: System.out.print("participant Ribbon");
	break;
	}
}
}