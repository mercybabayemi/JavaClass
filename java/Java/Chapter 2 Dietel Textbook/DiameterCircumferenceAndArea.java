import java.util.Scanner;
public class DiameterCircumferenceAndArea{
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		int radius = input.nextInt();
		
		System.out.printf("The diameter of the circle is %d%nThe circumference of the circle is %f%nThe area of the circle is %f%n", 2 * radius,  2 * Math.PI * radius, Math.PI * (radius * radius));
	}
}