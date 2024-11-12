public class TaskSix{
	public static void main(String[ ]args){
for(int number = 1; number <= 10; number++){
	if(number % 4 == 0){
	int result = number * number;
	int repeatResult = result * number;
	int anotherResult = repeatResult * number;
	int lastResult = anotherResult * number;
	System.out.printf("%d %d %d %d %d ", number, result, repeatResult, anotherResult, lastResult);
	}
	
}
	

}
}  