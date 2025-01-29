package ClassTaskJava.ClassTaskJennifer;

import java.util.Scanner;
public class PositiveAndNegativeNumber{
	public static void main(String[ ]arg){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter number: ");
	int number = input.nextInt();

if( number >= 1){
	System.out.print("Number is positive");
}

else{
	if( number <= -1){
	System.out.print("Number is negative");
}

else{
	System.out.print("Number is neutral");
}
}

}
}