package classtaskjava.ClassTaskJennifer;

import java.util.Scanner;
public class Age{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter your age: ");
	int age = input.nextInt();

	if(age <= 12){
	System.out.println("User is in child stage");
	}
	else if(age >= 13 && age <= 17){
	System.out.println("User is in teen stage");
	}
	else if(age >= 18 && age <= 64){
	System.out.println("User is in their adult stage");
	}
	else if(age >= 65){
	System.out.println("User is in their senior stage");
	}
}
}