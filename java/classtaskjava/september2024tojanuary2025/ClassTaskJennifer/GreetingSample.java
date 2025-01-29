package classtaskjava.ClassTaskJennifer;

import java.util.Scanner;
public class GreetingSample{
	public static void main(String[]args){
	
	Scanner input = new Scanner(System.in);

	System.out.println("Can I greet?\nPlease choose an option:\n1. English\n2. Yoruba\n3. Igbo\n4. French");

	int answer = input.nextInt();

	switch(answer){
	case 1: 
	System.out.print("Good Morning!!!");
	break;

	case 2:
	System.out.print("Ekaaro!!!");
	break;
	
	case 3: 
	System.out.print("Otutu Oma!!!");
	break;

	case 4: 
	System.out.print("Bonjour!!!");
	break;
	}

}
}