import java.util.Scanner;
public class WeekdayName{
	public static void main(String[ ]args){
	
	Scanner input = new Scanner(System.in);
	
	
	System.out.print("Enter a number between 1 and 7: ");
	int userInput = input.nextInt();


if(userInput == 1){
	System.out.println("Monday");
}
else{
if(userInput == 2){
	System.out.println("Tuesday");
}
else{
if(userInput == 3){
	System.out.println("Wednesday");
}
else{
if(userInput == 4){
	System.out.println("Thursday");
}
else{
if(userInput == 5){
	System.out.println("Friday");
}
else{
if(userInput == 6){
	System.out.println("Saturday");
}
else{
if(userInput == 7){
	System.out.println("Sunday");
}
else{
	System.out.println("Error message");
}
}
}
}
}
}
}

}
}