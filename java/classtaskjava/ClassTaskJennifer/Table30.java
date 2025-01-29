package ClassTaskJava.ClassTaskJennifer;

public class Table30{
	public static void main(String [] args){
	
	System.out.println("numbers\tsquares\tcubes");

	for(int numbers = 1; numbers <=30; numbers++){
		int squares = numbers * numbers;
		int cubes = numbers * numbers * numbers;

		System.out.println(numbers+"\t"+squares+"\t"+cubes);
	}
}
}