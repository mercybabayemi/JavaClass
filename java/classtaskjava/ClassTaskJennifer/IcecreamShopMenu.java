package ClassTaskJava.ClassTaskJennifer;

import java.util.Scanner;
public class IcecreamShopMenu{
	public static void main(String[]args){
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your type of dessert\n1. Icecream\n2. Sundae\n3. Milkshake: ");
	int dessert = input.nextInt();
	int icecream = 0;
	int sundae = 0;
	int milkshake = 0;
	switch(dessert){
	case 1: System.out.println("Icecream\nEnter your flavor selection\n1. Chocolate\n2. Vanilla\n3. Strawberry: ");
	icecream = input.nextInt();
		switch(icecream){
		case 1: System.out.println("1. Chocolate");
		break;
		case 2: System.out.println("2. Vanilla");
		break;
		case 3: System.out.println("3. Strawberry");
		break;
		}
	break;
	case 2:System.out.println("Sundae\nEnter your flavor selection\n1. Chocolate\n2. Vanilla\n3. Strawberry: ");
	sundae = input.nextInt(); 
		switch(sundae){
		case 1: System.out.println("1. Chocolate");
		break;
		case 2: System.out.println("2. Vanilla");
		break;
		case 3: System.out.println("3. Strawberry");
		break;
		}
	break;
	case 3: System.out.println("Milkshake\nEnter your flavor selection\n1. Chocolate\n2. Vanilla\n3. Strawberry: ");
	milkshake = input.nextInt();
		switch(milkshake){
		case 1: System.out.println("1. Chocolate");
		break;
		case 2: System.out.println("2. Vanilla");
		break;
		case 3: System.out.println("3. Strawberry");
		break;
		}
	break;
	}
	


	if(dessert == 1 && icecream == 1){
	System.out.print("The type of dessert chosen is icecream in chocolate flavor");
	}
	else if(dessert == 1 && icecream == 2){
	System.out.print("The type of dessert chosen is icecream in vanilla flavor");
	}
	else if(dessert == 1 && icecream == 3){
	System.out.print("The type of dessert chosen is icecream in strawberry flavor");
	}
	else if(dessert == 2 && sundae == 1){
	System.out.print("The type of dessert chosen is sundae in chocolate flavor");
	}
	else if(dessert == 2 && sundae == 2){
	System.out.print("The type of dessert chosen is sundae in vanilla flavor");
	}
	else if(dessert == 2 && sundae == 3){
	System.out.print("The type of dessert chosen is sundae in strawberry flavor");
	}
	else if(dessert == 3 && milkshake == 1){
	System.out.print("The type of dessert chosen is milkshake in chocolate flavor");
	}
	else if(dessert == 3 && milkshake == 2){
	System.out.print("The type of dessert chosen is milkshake in vanilla flavor");
	}
	else if(dessert == 3 && milkshake == 3){
	System.out.print("The type of dessert chosen is milkshake in strawberry flavor");
	}

}
}