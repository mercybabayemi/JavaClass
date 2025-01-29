package classtaskjava.ClassTaskJennifer;

import java.util.Scanner; 
public class ConvertFeetToMeter{ 
	public static void main(String[]args){ 	
	Scanner input = new Scanner(System.in); 

	System.out.print("Enter foot number:"); 
	double footNumber = input.nextDouble(); 
	

	double meterConverter = 0.305;

	double meterNumber = footNumber * meterConverter; 
	
	System.out.printf("Meternumber is %f%n", meterNumber); 
}
} 