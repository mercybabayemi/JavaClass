//grouptask2

import java.util.Scanner;
public class StudentGrade{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter student's name: ");
	String name = input.nextLine();

	System.out.print("Enter subject: ");
	String subject = input.nextLine();

	System.out.print("Enter student's mark: ");
	int scores = input.nextInt();

	System.out.print("Enter student's overall attendance in the term: ");
	int attendance = input.nextInt();

	if(scores > 80){
		System.out.printf("%s grade is a in %s with an overall attendance of %d", name, subject, attendance);
	}
	else if(scores > 70){
		System.out.printf("%s grade is b in %s with an overall attendance of %d", name, subject, attendance);
	}
	else if(scores > 60){
		System.out.printf("%s grade is c in %s with an overall attendance of %d", name, subject, attendance);
	}
	else if(scores > 50){
		System.out.printf("%s grade is d in %s with an overall attendance of %d", name, subject, attendance);
	}
	else if(scores > 40){
		System.out.printf("%s grade is e in %s with an overall attendance of %d", name, subject, attendance);
	}
	else if(scores > 30){
		System.out.printf("%s grade is f in %s with an overall attendance of %d", name, subject, attendance);
	}



	}
}