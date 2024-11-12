public class TaskNine{
	public static void main(String[ ]args){
int totalSum = 0;
int square = 0;
for(int number = 4; number <= 7; number++){
	if(number % 4 == 0){
	int result = number * number;
	int repeatResult = result * number;
	int anotherResult = repeatResult * number;
	int lastResult = anotherResult * number;
	int sum = number + result + repeatResult + anotherResult + lastResult;
	totalSum += sum;
	}
}

for(int number = 8; number <= 10; number++){
	if(number % 8 == 0){
	int result = number * number;
	int repeatResult = result * number;
	int anotherResult = repeatResult * number;
	int lastResult = anotherResult * number;
	int nextSum = number + result + repeatResult + anotherResult + lastResult;
	totalSum += nextSum;
	}
}
square = totalSum * totalSum;
System.out.print(square);

}
}