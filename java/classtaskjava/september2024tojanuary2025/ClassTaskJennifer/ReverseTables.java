package classtaskjava.ClassTaskJennifer;

public class ReverseTables{
	public static void main(String [] args){
	
	for(int number = 8; number >= 1; number--){
	for(int secondNumber = 8; secondNumber >= 1; secondNumber--){
		int product = number * secondNumber;
		System.out.print(number+" * "+secondNumber+" = "+product+"\t");
	}
	}


}
}