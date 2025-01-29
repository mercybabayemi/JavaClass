package classtaskjava.ClassTaskJennifer;

import java.util.Scanner;
public class EnergyCalculation{
	public static void main (String[ ]args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter amount of water in kilogram: ");
	double waterAmount = input.nextDouble();

	System.out.print("Enter initialTemperature in kilogram: ");
	double initialTemperature = input.nextDouble();

	System.out.print("Enter finalTemperature in kilogram: ");
	double finalTemperature = input.nextDouble();

	double energy = waterAmount * (finalTemperature - initialTemperature);

	System.out.printf("The energy needed is %f",energy);

}

}