package chapter5dieteltextbook;

import java.util.Scanner;
// 5.10 What does the following program do?
// Exercise 5.10: Printing.java
public class Counting{
	public static void main( String[] args ) { 
		Scanner s = new Scanner(System.in); 

		for (int i = 1; i < 3; i++) {
			for (int j = 1; j < 5; j++)System.out.print('*');
				System.out.println("\n#####");
		} // end outer for loop
	} // end main 
} // end class Counting 

/* program prints
****
#####
****
#####
*/