package classtaskjava.ClassTaskJennifer;

import java.util.Scanner;
public class SelectedCourses{
	public static void main(String[]args){
	
	Scanner input = new Scanner(System.in);

	System.out.println("Enter your chosen course\n1. Math\n2. Science\n3. History: ");
	int course = input.nextInt();

	switch(course){
	case 1: System.out.println("Math\nEnter your grade level\n1. Freshman\n2. Sophomore\n3. Junior\n4. Senior: ");
	int response = input.nextInt();
		switch(response){
		case 1: System.out.print("1. Freshman course instructor is Mr Ajibade");
		break;
		case 2: System.out.print("1. Sophomore course instructor is Miss Ayanfe");
		break;
		case 3: System.out.print("1. Junior course instructor is Mr Ayinde");
		break;
		case 4: System.out.print("1. Senior course instructor is Mr Ogo");
		break;
		}
	break;
	case 2: System.out.println("Science\nEnter your grade level\n1. Freshman\n2. Sophomore\n3. Junior\n4. Senior: ");
	int responseOne = input.nextInt();
		switch(responseOne){
		case 1: System.out.print("1. Freshman course instructor is Mr Bode");
		break;
		case 2: System.out.print("1. Sophomore course instructor is Mr Brian");
		break;
		case 3: System.out.print("1. Junior course instructor is Mrs Bimpe");
		break;
		case 4: System.out.print("1. Junior course instructor is Miss Tayo");
		break;
		}
	break;
	case 3: System.out.println("History\nEnter your grade level\n1. Freshman\n2. Sophomore\n3. Junior\n4. Senior: ");
	int responseTwo = input.nextInt();
		switch(responseTwo){
		case 1: System.out.print("1. Freshman course instructor is Mr Gbolahan");
		break;
		case 2: System.out.print("1. Sophomore course instructor is Mr Ridwan");
		break;
		case 3: System.out.print("1. Junior course instructor is Mr Ade");
		break;
		case 4: System.out.print("1. Senior course instructor is Miss Toyosi");

		break;
		}
	break;
	}

}
}
