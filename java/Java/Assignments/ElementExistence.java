public class ElementExistence{
	public static void main(String[] args){

	int[] numbers = {7,8,9,7,2,10,10,5};
	boolean elementExist = false;
	int element = 10;

	for(int i = 0; i < numbers.length; i++){
		if(numbers[i] == element ){
			elementExist = true;
			break;
		}
	}
	System.out.print(elementExist);
}
}