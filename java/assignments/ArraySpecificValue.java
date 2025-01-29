package Assignments;

public class ArraySpecificValue{
	public static void main(String[] args){
	
	int[] numbers = {5,10,15,20,25};

	int targetElement = 10;
	
	for(int index: numbers){
	if(targetElement == index){
	System.out.println("Target value is in variable");
	}
	}
	System.out.println(targetElement);
	
	
}
}