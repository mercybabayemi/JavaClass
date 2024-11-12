import java.util.Scanner;
public class DivisibleCheck{
	public static void main(String [ ] args){
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter number: ");

	int number = input.nextInt();

if(number % 5 == 0 && number % 11 == 0){
	System.out.println("Number is divisible by 11 and 5");
}
else{
System.out.println("Number is not divisible by 11 and 5");
}

}
}