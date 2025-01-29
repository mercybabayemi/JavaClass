package classtaskjava.ClassTaskJennifer;

import java.util.Scanner;
public class ThreeIntegersInput{
	public static void main(String[ ]arg){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first amount: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter second amount: ");
	int secondNumber = input.nextInt();

	System.out.print("Enter third amount: ");
	int thirdNumber = input.nextInt();
	
	int firstExtractedNumber = firstNumber % 10;
	int secondExtractedNumber = secondNumber % 10;
	int thirdExtractedNumber = thirdNumber % 10;

if (firstExtractedNumber == secondExtractedNumber){
	System.out.print("Result is true");
}

else{
	if (firstExtractedNumber == thirdExtractedNumber){
	System.out.print("Result is true");
}
else{
	if (secondExtractedNumber == firstExtractedNumber){
	System.out.print("Result is true");
}
else{
	if (secondExtractedNumber == thirdExtractedNumber){
	System.out.print("Result is true");
}
else{
	if (thirdExtractedNumber == firstExtractedNumber ){
	System.out.print("Result is true");
}

else{
	if (thirdExtractedNumber == secondExtractedNumber){
	System.out.print("Result is true");
}
else{
	System.out.print("Result is false");
}
}
}
}
}
}

}
}