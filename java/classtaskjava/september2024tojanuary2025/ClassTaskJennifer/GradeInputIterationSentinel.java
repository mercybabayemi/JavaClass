package classtaskjava.ClassTaskJennifer;

import java.util.Scanner;
public class GradeInputIterationSentinel{
	public static void main(String[ ]args){

	Scanner input = new Scanner(System.in);
	int count = 0;	
	int grade = 0;
	do{
		System.out.print("Enter grade(-1 to end): ");
		grade = input.nextInt();

		if(grade < 50){ 
		System.out.println("D");
		}
		else if(grade >= 50 && grade <= 60){ 
		System.out.println("C");
		}
		else if(grade >60 && grade <= 80){ 
		System.out.println("B");
		}
		else if(grade >80 && grade <= 100){ 
		System.out.println("A");
		}
		count++;
	}while(grade != -1);

}
}