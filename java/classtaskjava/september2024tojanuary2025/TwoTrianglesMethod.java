package classtaskjava;

public class TwoTrianglesMethod{
	public static void main(String[] args){
		printTwoTriangles(4);
}

	public static void printStar(){
		System.out.print("* ");
	}

	public static void printNewLine(){
		System.out.println();
	}

	public static void printStar(int numberOfTimes){
		for(int i = 0; i < numberOfTimes; i++){
			printStar();
		}
	}
	public static void printUpperTriangle(int numberOfTimes){
		for(int i = 1; i <= numberOfTimes; i++){
			printStar(i);
			printNewLine();
		}
	}
	public static void printLowerTriangle(int numberOfTimes){
		for(int i = numberOfTimes; i > 0; i--){
			printStar(i);
			printNewLine();
		}
	}
	public static void printTwoTriangles(int numberOfTimes){
		printUpperTriangle(numberOfTimes);
		printLowerTriangle(numberOfTimes);

	}
}