public class NaturalNumberSum{
	public static void main(String[]args){
	
	int sum = 0;
	int counter = 1;
while (counter <= 10){
	System.out.printf("%d%n", counter);
	sum = sum + counter;
	counter++;
}
	System.out.printf("The sum of all natural numbers is %d", sum);

}
}