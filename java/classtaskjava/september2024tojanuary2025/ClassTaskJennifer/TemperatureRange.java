package classtaskjava.ClassTaskJennifer;

import java.util.Scanner;
public class TemperatureRange{
	public static void main(String[]args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter temperature in Celsius: ");
	int temperature = input.nextInt();

	if(temperature < 10){
	System.out.print("Temperature is cold");
	}
	else if(temperature <= 20 || temperature <= 25){
	System.out.print("Temperature is warm");
	}
	else if(temperature >= 25){
	System.out.print("Temperature is hot");
	}
}
}