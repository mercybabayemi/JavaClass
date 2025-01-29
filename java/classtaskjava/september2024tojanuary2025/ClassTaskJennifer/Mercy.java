package classtaskjava.ClassTaskJennifer;

import java.util.Scanner;
public class Mercy{
	public static void main(String[]args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter your name:");
	String userName = input.nextLine();

System.out.println("Hi" + userName + ",Nice to meet you!");
System.out.print("Hi" + userName + ",Nice to meet you!\n");
System.out.printf("Hi %s, Nice to meet you!",userName);

}
}