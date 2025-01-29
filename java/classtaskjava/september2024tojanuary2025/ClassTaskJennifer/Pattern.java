package classtaskjava.ClassTaskJennifer;
//grouptask3

public class Pattern{
	public static void main(String[] args){
	int number = 0;
	
	for(int outerLoop = 0; outerLoop < 3; outerLoop++){
		for(int innerLoop = 1; innerLoop <= 3; innerLoop++){
			number += 1;
			System.out.print(number + " ");
		}
		System.out.println(" ");
	}
}
}