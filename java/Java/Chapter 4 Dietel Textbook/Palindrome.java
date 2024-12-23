import java.util.Scanner; 

public class Palindrome{ 
 	public static void main(String[] args){ 	
	Scanner input = new Scanner(System.in); 

	System.out.print("Enter a five digit number: "); 
	String number = input.nextLine(); 
	

	while(number.length() < 5 ){
		System.out.print("Error message\nEnter a five digit number: "); 
		number = input.nextLine();
	}
		
	int num = Integer.parseInt(number);

	int firstNumber =  num / 10000;

	int secondTrial =  num / 1000;
	int secondNumber = secondTrial % 10;

	int thirdTrial =  num / 100;
	int thirdNumber = thirdTrial % 10;

	int fourthTrial = num / 10;
	int fourthNumber = fourthTrial % 10;

	int fifthNumber =  num % 10;


	System.out.printf("%d %d %d %d %d%n", firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber); 

	if(firstNumber == fifthNumber && secondNumber == fourthNumber){
		System.out.print("Integer is a palindrome integer");
	}else{
		System.out.print("Integer is not a palindrome integer");

	}
}
}
