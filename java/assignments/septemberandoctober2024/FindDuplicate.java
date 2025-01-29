package assignments;

public class FindDuplicate{
	public static void main(String[] args){

	int[] numbers = {7,8,9,7,2,10,10,5};
	String duplicateFound = " ";

	for(int i = 0; i < numbers.length; i++){
		for(int j = i + 1 ; j < numbers.length; j++){
			if(numbers[i] ==  numbers[j]){
				duplicateFound += numbers[i];
				duplicateFound += ",";
			}
		}
	}
	System.out.println(duplicateFound);
}
}