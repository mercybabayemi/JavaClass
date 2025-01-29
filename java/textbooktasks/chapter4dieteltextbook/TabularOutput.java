package chapter4dieteltextbook;

public class TabularOutput{
	public static void main(String[] args){
		System.out.println("N\tN\u00B2\t\u00B3\t\u2074");
		for(int number = 1; number < 6; number++){
			System.out.printf("%d\t%d\t%d\t%d%n", number, number * number, number * number * number, number * number * number * number);
		}
	}
}