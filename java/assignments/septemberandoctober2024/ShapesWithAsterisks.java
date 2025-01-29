package assignments;

import java.util.Scanner;

public class ShapesWithAsterisks{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	int variable = 5;
        
	System.out.println(variable);
        System.out.print("enter a new number: ");
        int numberOne = input.nextInt();
        variable = numberOne;
        System.out.println(variable);

System.out.println("*********    ****     *       *");
System.out.println("*       *   *    *   ***     * *");
System.out.println("*       *  *      * *****   *   *");
System.out.println("*       *  *      *   *    *     *");
System.out.println("*       *  *      *   *   *       *");
System.out.println("*       *  *      *   *    *     *");
System.out.println("*       *  *      *   *     *   *");
System.out.println("*       *   *    *    *      * *");
System.out.println("*********    ****     *       *");
}
}