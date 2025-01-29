package classtaskjava;

public class PrintTable{
	public static void main(String[]args){
	
	System.out.printf("%s %7s %10s%n", "a", "b", "pow(a,b)");

	int a = 1;
	int b = 2;
	int counter = 1;
while (counter <= 5){
	double power = Math.pow(a, b);
	System.out.print(a + "\t" + b + "\t" + power +"\n");
	counter++;
	a +=1;
	b +=1;
}

}
}