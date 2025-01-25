import java.util.Scanner;
public class HeartRateTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter client's first name: ");
		String firstName = input.nextLine();

		System.out.print("Enter client's last name: ");
		String lastName = input.nextLine();

		System.out.print("Enter client's date of birth(dd-mm-yyyy): ");
		String dateOfBirth = input.nextLine();
		
		String[] dateOfBirthParts = dateOfBirth.split("-");

		int dateOfBirthDay = Integer.parseInt(dateOfBirthParts[0]);

		int dateOfBirthMonth = Integer.parseInt(dateOfBirthParts[1]);
		
		int dateOfBirthYear = Integer.parseInt(dateOfBirthParts[2]);

		System.out.print("Enter current year: ");
		int currentYear = input.nextInt();

		HeartRate client1 = new HeartRate(firstName, lastName, dateOfBirthDay, dateOfBirthMonth, dateOfBirthYear);

		System.out.printf("Client's first name: %s%nClient's last name: %s%nClient's date of birth: %d-%d-%d%n", firstName, lastName, dateOfBirthDay, dateOfBirthMonth, dateOfBirthYear);


		System.out.printf("Client's age: %d%nClient's maximum heart rate: %d%nClient's target heart rate range: %.2f%% - %.2f%% %n", client1.getPersonAge(currentYear),client1.getPersonMaximumHeartRate(currentYear),client1.getPersonTargetHeartRateRange1(currentYear), client1.getPersonTargetHeartRateRange2(currentYear));

	}
}