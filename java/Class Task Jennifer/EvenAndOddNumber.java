import java.util.Scanner;
public class EvenAndOddNumber{
	public static void main(String [ ] args){
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter number: ");

	int number = input.nextInt();

if(number % 2 == 0 ){
	System.out.println("Number is an even number");
}
else{
System.out.println("Number is an odd number");
}

}
}