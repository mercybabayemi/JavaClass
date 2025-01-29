package ClassTaskJava.ClassTaskJennifer;

import java.util.Scanner;
public class GradeInputIterationSwitch{
	public static void main(String[ ]args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter grade option: \n1. 50\n2. 70\n3. 100\n4. Grade < 50");

	int grade = input.nextInt();
	
	switch(grade){
	case 1:
	System.out.println("C");
	break;

	case 2:
	System.out.println("B");
	break;

	case 3:
	System.out.println("A");
	break;

	case 4:
	System.out.println("Well done!!");
	break;
	}
	
}
}