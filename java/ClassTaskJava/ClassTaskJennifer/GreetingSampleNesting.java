package ClassTaskJava.ClassTaskJennifer;

import java.util.Scanner;
public class GreetingSampleNesting{
	public static void main(String[]args){
	
	Scanner input = new Scanner(System.in);

	System.out.println("Can I greet?\nPlease choose an option:\n1. English\n2. Yoruba\n3. Igbo\n4. German");

	int answer = input.nextInt();

	switch(answer){
	case 1: 
	System.out.println("Should i greet in:\n1. Morning\n2.Afternoon\n3.Evening");
	int english = input.nextInt();
		switch(english){
		case 1:
		System.out.print("Good morning!!");
		break;
		case 2:
		System.out.print("Good afternoon!!");
		break;
		case 3:
		System.out.print("Good evening!!");
		break;
		}
	break;
	

	case 2:
	System.out.println("Should i greet in:\n1. Morning\n2.Afternoon\n3.Evening");
	int yoruba = input.nextInt();
		switch(yoruba){
		case 1:
		System.out.print("Ekaaro!!");
		break;
		case 2:
		System.out.print("Ekaasan!!");
		break;
		case 3:
		System.out.print("Eku irole!!");
		break;
		}
	break;
	
	
	case 3: 
	System.out.println("Should i greet in:\n1. Morning\n2.Afternoon\n3.Evening");
	int igbo = input.nextInt();
		switch(igbo){
		case 1:
		System.out.print("Otutuoma!!");
		break;
		case 2:
		System.out.print("Eyioma!!");
		break;
		case 3:
		System.out.print("Abali!!");
		break;
		}

	break;

	case 4: 
	System.out.println("Should i greet in:\n1. Morning\n2.Afternoon\n3.Evening");
	int german = input.nextInt();
		switch(german){
		case 1:
		System.out.print("Guten morgen!!");
		break;
		case 2:
		System.out.print("Guten tag!!");
		break;
 
		case 3:
		System.out.print("Guten nacht!!");
		break;
		}

	break;
	}

}
}