package ClassTaskJava;

public class PositiveAndNegativeCount{
	public static int getIndexPositiveCount(int[] input){
		int positiveCount = 0;
		for(int item : input){
			if(item > 0){
				positiveCount += 1;
			}
		}
		return positiveCount;
	}

	public static int getIndexNegativeCount(int[] input){
		int negativeCount = 0;
		for(int item : input){
			if(item < 0){
				negativeCount += 1;
			}
		}
		return negativeCount;
	}
}