import java.util.Scanner;
public class ConvertToPound{
	public static void main (String[ ]args){
Scanner input = new Scanner(System.in);
	
	System.out.print("Enter number in pounds: ");
	double number = input.nextDouble();
	double result = number * 0.454;

System.out.printf("%f pound is %.2f kilogram", number, result);

}
}
 
