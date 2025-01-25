package ClassTaskJava.ClassTaskJennifer;

import java.util.Scanner;
public class ShapesCalculation{
	public static void main(String[]args){
	
	Scanner input = new Scanner(System.in);

	System.out.println("What type of shape do you want to calculate\n1. Circle\n2. Rectangle\n3.Triangle: ");
	int shape = input.nextInt();

	double circleResult = 0;
	double numberGenerator= Math.random();
	double randomNumber = numberGenerator * 10;
	double rectangleResult = 0;
	double triangleResult = 0;

	switch(shape){
	case 1: System.out.println("Circle\nDo you want to input the radius for calculation?\n1. Yes\n2. No");
	int firstChoice = input.nextInt();

		switch(firstChoice){
		case 1: System.out.println("Yes\nEnter radius: ");
		int radius = input.nextInt();
		circleResult = 3.14 * radius * radius;
		System.out.print("The result of calculated circle is " + circleResult);
		break;
		case 2: circleResult = 3.14 * randomNumber * randomNumber;
		System.out.print("No\nThe result of calculated circle is " + circleResult);
		break;
		}
	break;
	case 2: System.out.println("Rectangle\nDo you want to input the length and breadth for calculation?\n1. Yes\n2. No");
	int secondChoice = input.nextInt();
		switch(secondChoice){
		case 1: System.out.println("Yes\nEnter length: ");
		int length = input.nextInt();
		System.out.println("Enter breadth: ");
		int breadth = input.nextInt();
		rectangleResult = length * breadth;
		System.out.print("The result of calculated rectangle is " + rectangleResult);
		break;
		case 2: rectangleResult = randomNumber * randomNumber;
		System.out.print("No\nThe result of calculated rectangle is " + rectangleResult);
		break;
		}
	break;
	case 3: System.out.println("Triangle\nDo you want to input the base and height for calculation?\n1. Yes\n2. No");
	int thirdChoice = input.nextInt();
		switch(thirdChoice){
		case 1: System.out.println("Yes\nEnter base: ");
		int base = input.nextInt();
		System.out.println("Enter height: ");
		int height = input.nextInt();
		triangleResult = base * height / 2;
		System.out.print("The result of calculated rectangle is " + triangleResult);
		break;
		case 2: triangleResult = randomNumber * randomNumber / 2;
		System.out.print("No\nThe result of calculated triangle is " + triangleResult);
		break;
		}
	break;
	}
}
}