package classtaskjava.ClassTaskJennifer;

import java.util.Scanner;
public class AreaOfPolygon{
	public static void main (String[ ]args){
Scanner input = new Scanner(System.in);
	
	System.out.print("Enter number of sides: ");
	double number = input.nextDouble();

	System.out.print("Enter length of a side: ");
	double length = input.nextDouble();

 	double area = ( number * ( Math.pow(length,2) ) ) / (4 * ( Math.tan(3.142/number) ) );

System.out.printf("The area of the polygon is %.2f", area);

}
}
 