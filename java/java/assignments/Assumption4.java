package java.assignments;

public class Assumption4 {
	public static void main(String[] args){
	int x = 5;
	x += x++ * 5;
	System.out.print(x);
	//The calculation means x = 5 + 5 * 5
}
}