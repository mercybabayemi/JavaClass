package Chapter4DietelTextbook;
//4.16 What does the following program print?

public class Mystery {
	public static void main(String[] args) {
		int x = -2;
		int total = 0;

		while (x <= 10) {
			int y = x + 2;
			x++;
			total += y;
			System.out.printf("Y is: %d and total is %d\n", y, total);
		}// end while
	}// end main
} // end class Mystery

/* It prints Y is: 0 and total is 0
Y is: 1 and total is 1
Y is: 2 and total is 3
Y is: 3 and total is 6
Y is: 4 and total is 10
Y is: 5 and total is 15
Y is: 6 and total is 21
Y is: 7 and total is 28
Y is: 8 and total is 36
Y is: 9 and total is 45
Y is: 10 and total is 55
Y is: 11 and total is 66
Y is: 12 and total is 78
*/
