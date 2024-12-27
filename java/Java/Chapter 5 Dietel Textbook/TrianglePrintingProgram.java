public class TrianglePrintingProgram{
	public static void main(String[] arags){
		System.out.printf("%s%15s%15s%15s%n","(a)","(b)","(c)","(d)");
	
		for(int outer = 1; outer <= 10; outer++){
			for(int inner = 1; inner <= outer; inner++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
			
		for(int outer = 1; outer <= 10; outer++){
			for(int inner = outer; inner <= 10; inner++){
				System.out.print("*");
			}
			System.out.println();
		}

		for(int outer = 1; outer <= 10; outer++){
			for(int inner = 1; inner <= outer; inner++){
				System.out.print(" ");
			}
			for(int patternDeterminant = outer; patternDeterminant <= 10; patternDeterminant ++){
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		for(int outer = 1; outer <= 10; outer++){
			for(int inner = outer; inner <= 10; inner++){
				System.out.print(" ");
			}

			for(int patternDeterminant = 1; patternDeterminant < outer; patternDeterminant ++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}