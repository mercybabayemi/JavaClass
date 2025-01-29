package ClassTaskJava.ClassTaskJennifer;

import java.util.Scanner;
public class SelectedDepartment{
	public static void main(String[]args){
	
	Scanner input = new Scanner(System.in);

	System.out.println("Enter your department\n1. IT\n2. HR\n3. Finance: ");
	int department = input.nextInt();

	switch(department){
	case 1: System.out.println("IT Department\n1. Head of department\n2. Assistant head of department\n3. Operational manager\n4. Operational officer\n5. Intern");
	int response = input.nextInt();
		switch(response){
		case 1: System.out.print("Head of department\n I am so proud of you");
		break;
		case 2: System.out.print("Assistant head of department\n Keep going, you are doing well");
		break;
		case 3: System.out.print("Operational Manager\n Keep going, you are doing well");
		break;
		case 4: System.out.print("Operational officer\n Keep going, you are doing well");
		break;
		case 5: System.out.print("Intern\n You have taken the big step towards your career, keep soaring");
		break;
		}
	break;
	case 2: System.out.println("HR Department\n1. Head of department\n2. Assistant head of department\n3. Recruitment manager\n4. Intern");
	int responseOne = input.nextInt();
		switch(responseOne){
		case 1: System.out.print("Head of department\n I am so proud of you");
		break;
		case 2: System.out.print("Assistant head of department\n Keep going, you are doing well");
		break;
		case 3: System.out.print("Recruitment Manager\n Keep going, you are doing well");
		break;
		case 4:  System.out.print("Intern\n You have taken the big step towards your career, keep soaring");
		break;
		}
	break;
	case 3: System.out.println("Finance Department\n1. Head of department\n2. Assistant head of department\n3. Analyst\n4. Intern");
	int responseTwo = input.nextInt();
		switch(responseTwo){
		case 1: System.out.print("Head of department\n I am so proud of you");
		break;
		case 2: System.out.print("Assistant head of department\n Keep going, you are doing well");
		break;
		case 3: System.out.print("Recruitment Manager\n Keep going, you are doing well");
		break;
		case 4: System.out.print("Intern\n You have taken the big step towards your career, keep soaring");
		break;
		}
	break;
	}
}
}