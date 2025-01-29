package assignments;

public class DuplicateOccurence{
	public static void main(String[] args){

	int[] numbers = {7,8,9,7,2,10,10,5};
	boolean duplicateFound = false;

	for(int i = 0; i < numbers.length; i++){
		for(int  j = i + 1 ; j < numbers.length; j++){
			if(numbers[i] ==  numbers[j]){
				duplicateFound = true;
				break;
			}
		}
	}
	System.out.print(duplicateFound);
}
}