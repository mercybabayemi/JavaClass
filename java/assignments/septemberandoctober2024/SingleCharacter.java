package assignments;

import java.util.Scanner;
public class SingleCharacter{
	public static void main(String[ ]args){
	
	Scanner input = new Scanner(System.in);
	
	
	System.out.print("Enter a single alphabet: ");
	String userInput = input.nextLine();

	char A = 'A';
	char a = 'a';
	char E = 'E';
 	char e = 'e';
	char I = 'I';
	char i = 'i';
	char O = 'O';
 	char o = 'o';
	char U = 'U';
 	char u = 'u';
if(userInput.length() == 1 && Character.isAlphabetic(userInput.charAt(0))){

	if(userInput.charAt(0) == A){
		System.out.println("Letter Input is a vowel");
	}
	else{
	if(userInput.charAt(0) == a){
		System.out.println("Letter Input is a vowel");
	}
	else{
	if(userInput.charAt(0) == E){
		System.out.println("Letter Input is a vowel");
	}
	else{
	if(userInput.charAt(0) == e){
		System.out.println("Letter Input is a vowel");
	}
	else{
	if(userInput.charAt(0) == I){
		System.out.println("Letter Input is a vowel");
	}
	else{
	if(userInput.charAt(0) == i){
		System.out.println("Letter Input is a vowel");
	}
	else{
	if(userInput.charAt(0) == O){
		System.out.println("Letter Input is a vowel");
	}
	else{
	if(userInput.charAt(0) == o){
		System.out.println("Letter Input is a vowel");
	}
	else{
	if(userInput.charAt(0) == U){
		System.out.println("Letter Input is a vowel");
	}
	else{
	if(userInput.charAt(0) == u){
		System.out.println("Letter Input is a vowel");
	}
	else{
	System.out.println("Letter Input is a consonant");
	}
	}
	}
	}
	}
	}
	}
	}
	}
	}
}
else{
	System.out.println("Error message");
}

}
}