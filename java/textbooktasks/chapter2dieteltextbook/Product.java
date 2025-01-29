package chapter2dieteltextbook;

import java.util.Scanner;
public class Product {
	public static void main(String[] args) {
	int numberOne = 2;
	int numberTwo = 5;
	int numberThree = 6;

	int product = numberOne * numberTwo * numberThree;
	System.out.println("Product is " + product);


	Scanner input = new Scanner(System.in);
	System.out.println("Enter first integer: ");
	int x = input.nextInt();

	System.out.println("Enter second integer: ");
	int y = input.nextInt();


	System.out.println("Enter third integer: ");
	int z = input.nextInt();

	int result = x * y * z;
	System.out.println("Result is " + result);

	int p = 5;
	System.out.printf("%d", p + 2 * 4);
	System.out.printf("%d", p * 2 + 4);

	}

}