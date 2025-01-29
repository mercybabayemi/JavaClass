package ClassTaskJava.ClassTaskJennifer;

import java.util.Scanner;
public class Display30 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter between 1 to 30: ");
		int entree = input.nextInt();

		int number = 0;
		int counter = 1;

		while (number <= 5) {
			System.out.printf(" %d %d %d %d %d", entree);
			counter++;


			for (int i = 1; i <= 30; i++) {
				System.out.print("*");
			}
		}
	}
}