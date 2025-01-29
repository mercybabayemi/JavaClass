package classtaskjava.ClassTaskJennifer;

import java.util.Scanner;
public class GreatestNumberPrint{
	public static void main(String[ ]arg){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first amount: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter second amount: ");
	int secondNumber = input.nextInt();

	System.out.print("Enter third amount: ");
	int thirdNumber = input.nextInt();
	
	int greatestNumber = 0;

if (firstNumber >= secondNumber){
	greatestNumber += firstNumber;
	System.out.printf("Greatest number is %d",greatestNumber);
}

else{
	if (firstNumber >= thirdNumber){
	greatestNumber += firstNumber;
	System.out.printf("Greatest number is %d",greatestNumber);
	}
else{
	if (secondNumber >= firstNumber){
	greatestNumber += secondNumber;
	System.out.printf("Greatest number is %d",greatestNumber);
	}
else{
	if (secondNumber >= thirdNumber){
	greatestNumber += secondNumber;
	System.out.printf("Greatest number is %d",greatestNumber);
	}
else{
	if (thirdNumber >= firstNumber ){
	greatestNumber += thirdNumber;
	System.out.printf("Greatest number is %d",greatestNumber);
	}

else{
	if (thirdNumber >= secondNumber){
	greatestNumber += thirdNumber;
	System.out.printf("Greatest number is %d",greatestNumber);
	}
}
}
}
}
}

}
}