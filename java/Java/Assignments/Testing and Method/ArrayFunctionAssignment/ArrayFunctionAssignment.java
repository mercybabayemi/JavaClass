public class ArrayFunctionAssignment{
	public static void main(String[] args){

 	int[] numbers =  ;
	System.out.println(largestElement(numbers));
 
	reversedList(numbers);
	
	int element = 45;
	elementOccurance(numbers,element);

	oddPositionNumbers(numbers);

	System.out. println("total is " + runningTotalComputed(numbers));

	System.out.println(isPalindrome("madam"));
	System.out.println(isPalindrome("nun"));
	System.out.println(isPalindrome("mercy"));
	
	System.out.println(firstTotalSumComputed(numbers));
	System.out.println(secondTotalSumComputed(numbers));
	System.out.println(thirdTotalSumComputed(numbers));

	}

	public static int largestElement(int[] numbers){
		int largestNumber = numbers[0];
		
		for(int number : numbers){
			if(number > largestNumber) largestNumber = number;
		}
		return largestNumber;
	}
	
	public static void reversedList(int[] numbers){
		for(int item = numbers.length - 1; item >= 0; item--){
			System.out.print(numbers[item] + " ");
		}
		System.out.println();
	}
	
	public static void elementOccurance(int[] numbers,int element){
		for(int item = 0; item < numbers.length; item++){
			if(numbers[item] == element) System.out.printf("Element exist in list at index %d%n", item);
			if(numbers[item] != element) System.out.printf("Element does not exist in list at index %d%n", item);
		}
		
	}

	public static void oddPositionNumbers(int[] numbers){
		for(int item = 0; item < numbers.length; item++){
			if(numbers[item] % 2 != 0) System.out.print(numbers[item] + " ");
		}
		System.out.println();
	}

	public static int runningTotalComputed(int[] numbers){
		int total = 0;
		for(int item = 0; item < numbers.length; item++){
			total += numbers[item];
			System.out.printf("Running sum is currently %d%n", total);
		}
		return total;
	}

	public static boolean isPalindrome(String input){
		int startComparison = 0;
		int stopComparison = input.length() - 1;
		while(startComparison < stopComparison){
			if(input.charAt(startComparison) != input.charAt(stopComparison)) return false;
			startComparison++;
			stopComparison--;
		}
		return true;
	}
 
    	public static int firstTotalSumComputed(int[] numbers){
		int total = 0;
		for(int item = 0; item < numbers.length; item++){
			total += numbers[item];
		}
		return total;
	}

	public static int secondTotalSumComputed(int[] numbers){
		int total = 0;
		int item = 0;
		while(item < numbers.length){
			total += numbers[item];
			item++;
		}
		return total;
	}

	public static int thirdTotalSumComputed(int[] numbers){
		int total = 0;
		int item = 0;
		do{
			total += numbers[item];
			item++;
		}while(item < numbers.length);
		return total;
	}

	
}