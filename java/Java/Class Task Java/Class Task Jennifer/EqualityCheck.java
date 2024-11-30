import java.util.Scanner;
public class EqualityCheck{
	public static void main(String[ ]args){
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first number: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter second number: ");
	int secondNumber = input.nextInt();

	System.out.print("Enter third number: ");
	int thirdNumber = input.nextInt();

if(firstNumber == secondNumber && firstNumber == thirdNumber){
	System.out.println("Numbers are equal");
}
else{
	System.out.println("Numbers are not equal");
}

}
}