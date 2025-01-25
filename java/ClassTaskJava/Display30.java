package ClassTaskJava;

import java.util.Scanner;

public class Display30{
	public static void main(String[ ]args){

	Scanner input = new Scanner(System.in);
	
	int counter = 1;
	String graph = "";

	do {
		System.out.print("Enter between 1 to 30: ");
		int entree = input.nextInt();


		if(entree >= 0 && entree <= 30){
			for(int i = 1; i <= entree; i++){
				graph += "*";
			}

			graph += "\n";

			counter++;
		}else{
			System.out.println("Value out of range.");		
		}
	}while(counter <= 5);

	System.out.println("Graph data");
	
	System.out.println(graph);
	
	}
}