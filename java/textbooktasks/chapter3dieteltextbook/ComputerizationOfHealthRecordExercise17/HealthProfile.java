package chapter3dieteltextbook.ComputerizationOfHealthRecordExercise17;

import java.util.Scanner;
public class HealthProfile{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter patient's first name: ");
		String firstName = input.nextLine();

		System.out.print("Enter patient's last name: ");
		String lastName = input.nextLine();

		System.out.print("Enter patient's gender: ");
		String gender = input.nextLine();

		System.out.print("Enter client's date of birth(dd-mm-yyyy): ");
		String dateOfBirth = input.nextLine();
		
		String[] dateOfBirthParts = dateOfBirth.split("-");

		int dateOfBirthDay = Integer.parseInt(dateOfBirthParts[0]);

		int dateOfBirthMonth = Integer.parseInt(dateOfBirthParts[1]);
		
		int dateOfBirthYear = Integer.parseInt(dateOfBirthParts[2]);

		System.out.print("Enter current year: ");
		int currentYear = input.nextInt();
 
		System.out.print("Enter patient's weight in pounds:"); 
		double weightInPounds = input.nextDouble(); 

		System.out.print("Enter patient's height in inches:");
		double heightInInches = input.nextDouble();


		StarterHealthProfile patient1 = new StarterHealthProfile(firstName,  lastName, gender, dateOfBirthDay, dateOfBirthMonth, dateOfBirthYear, heightInInches, weightInPounds);

		System.out.printf("Patient's first name: %s%nPatient's last name: %s%nPatient's gender: %s%nPatient's date of birth: %d-%d-%d%n", firstName, lastName, gender, dateOfBirthDay, dateOfBirthMonth, dateOfBirthYear);


		System.out.printf("Patient's age: %d%nPatient's maximum heart rate: %d%nPatient's target heart rate range: %.2f%% - %.2f%% %n", patient1.getPersonAge(currentYear),patient1.getPersonMaximumHeartRate(currentYear),patient1.getPersonTargetHeartRateRange1(currentYear), patient1.getPersonTargetHeartRateRange2(currentYear));

		System.out.printf("Patient's body mass index: %.2f%n", patient1.getBodyMassIndex());

		if (patient1.getBodyMassIndex() < 18.5){
			System.out.println("The BMI category is underweight");
		}
		else if (patient1.getBodyMassIndex() >= 18.5 && patient1.getBodyMassIndex() <= 24.9){
			System.out.println("The BMI category is normalweight");
		}
		else if (patient1.getBodyMassIndex() >= 25.0 && patient1.getBodyMassIndex() <= 29.9){
			System.out.println("The BMI category is overweight");
		}
		else if (patient1.getBodyMassIndex() >= 30.0 ){
			System.out.println("The BMI category is obese");
		}
		else {
			System.out.println("The BMI category is morbidly obese"); 
		} 


	}
}