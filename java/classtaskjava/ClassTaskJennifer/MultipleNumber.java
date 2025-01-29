import java.util.Scanner;
public class MultipleNumber{
	public static void main(String [ ] args){
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter number: ");

	int number = input.nextInt();

if(number % 5 == 0){
	System.out.println("Number is a multiple of 5");
}
else{
System.out.println("Number is not a multiple of 5");
}

}
}