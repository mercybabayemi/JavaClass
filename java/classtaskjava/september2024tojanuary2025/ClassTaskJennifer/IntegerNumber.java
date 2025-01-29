package classtaskjava.ClassTaskJennifer;

import java.util.Scanner;
public class IntegerNumber{
	public static void main(String[ ]args){
	
	Scanner input = new Scanner(System.in);
 	System.out.print("Enter binary number: ");
 
	String binaryNumber = input.nextLine();
	
	int decimalValue = Integer.parseInt(binaryNumber , 2);


System.out.print("The decimal value is: "+ decimalValue);

}
}