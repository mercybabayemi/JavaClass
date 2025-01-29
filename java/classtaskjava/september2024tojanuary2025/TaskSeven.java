package classtaskjava;

public class TaskSeven{
	public static void main(String[ ]args){
for(int number = 1; number <= 10; number++){
	if(number % 4 == 0){
	int result = number * number;
	int repeatResult = result * number;
	int anotherResult = repeatResult * number;
	int lastResult = anotherResult * number;
	int sum = number + result + repeatResult + anotherResult + lastResult;
	System.out.printf("%d ", sum);
	}
}
	

}
}  