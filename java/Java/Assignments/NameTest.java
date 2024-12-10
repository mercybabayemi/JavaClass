import java.util.Scanner;

public class NameTest {
	public static void main(String[] args) {
		// create a Scanner object to obtain input from the command 	
		Scanner input = new Scanner(System.in);

		// create an Account object and assign it to myAccount
		Name myName = new Name(); 
		myName.getName();

		// display initial value of name (null)
		System.out.printf("Initial name is: %s%n%n", myName.getName());
	
		// prompt for and read name
		System.out.println("Please enter the name:");

		String theName = input.nextLine(); // read a line of text
		myName.setName(theName); // put theName in myAccount 

		System.out.println(); // outputs a blank line

		// display the name stored in object myAccount
		System.out.printf("Name in object myName is:%n%s%n",myName.getName());
	}
}