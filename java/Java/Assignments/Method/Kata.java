public class Kata{

	public static void main(String[] args){
		
		int integer = 46;
		System.out.println(isEven(integer));
		
		System.out.println(isPrimeNumber(integer));
		System.out.println(isPrimeNumber(7));

		int integer1 = 30;
		int integer2 = 10;
		System.out.println(subtract(integer1, integer2));

		divide(integer1, integer2);
		divide(20,0);
		divide(0,30);
		divide(integer2 , integer1);
		
		System.out.println(factorOf(integer));

		System.out.println(isSquare(integer));
		System.out.println(isSquare(25));

		System.out.println(isPalindrome(integer));
		System.out.println(isPalindrome(121));

		System.out.println(factorialOf(integer));
		System.out.println(factorialOf(5));

		System.out.println(squareOf(5));
		System.out.println(squareOf(integer));

	}

	public static boolean isEven(int integer){
		if(integer % 2 == 0) return true;
		return false;
	}

	public static boolean isPrimeNumber(int integer){
		
		int count = 3;

		if(integer <= 2) return false;

		if(integer == 2) return true;

		if(integer % 2 == 0) return false;

		else while(count <= integer-1){

			if(integer % count == 0) return false;

			count++;
		}
		return true;
	}

	public static int subtract(int integer1, int integer2){
		int subtraction = 0;
		
		if(integer1 > integer2) subtraction = integer1 - integer2;
		
		else subtraction = integer2 - integer1;

		return subtraction;
	}

	public static void divide(int integer1, int integer2){
		int division = 0;

		if(integer2 == 0 || integer1 == 0) System.out.println("Error: 0");

		else{
		float result = (float)integer1 / integer2; 
		System.out.println(result);
		}

	}

	public static int[] factorOf(int integer){
		int count = 0;
		for(int item = 1; item <= Math.sqrt(integer); item++){
			if(integer % item == 0){
				count++;
			}
			if(item != integer / item){
				count++;
			}
		}
		int[] factors = new int[count];
		int index = 0;
		for(int item = 1; item <= Math.sqrt(integer); item++){
			if(integer % item == 0){
				factors[index] = item;
				index++;
			}
			if(item != integer / item){
				factors[index] = integer / item;
				index++;
			}
		}

		return factors;
	}
	
	public static boolean isSquare(int integer){
		int result = (int)Math.sqrt(integer);
		return result * result == integer;
	}

	public static boolean isPalindrome(int integer){
		int reversed = 0;
		int original = integer;
		int digit = 0;
		while(integer != 0){
			digit = integer % 10;
			reversed = reversed * 10 + digit;
			integer /= 10;
		}

		return original == reversed;
	}

	public static long factorialOf(int integer){
		int result = 1;
		for(int item = 1; item <= integer; item++){
			result *= item;
		}
		
		return result;
	}

	public static long squareOf(int integer){
		int result = integer * integer;
		return result;
	}

}