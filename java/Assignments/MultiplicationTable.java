package Assignments;

public class MultiplicationTable{
	public static void main(String [ ] args){
for(int multipleNumber = 1; multipleNumber <= 9; multipleNumber++ ){
	for(int number = 1; number <= 9; number++){
	int product = multipleNumber * number;

	System.out.printf("%d * %d = %d\t", number, multipleNumber, product);
}	
System.out.println();
}

}
}