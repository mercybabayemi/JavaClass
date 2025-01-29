package ClassTaskJava.ClassTaskJennifer;

import java.util.Scanner;
public class EvenAndOddNumbers{
	public static void main(String[ ]arg){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a amount: ");
	int number = input.nextInt();

if (number % 2 == 0){
	System.out.print("1");
}
else{
	System.out.print("0");
}

}
}