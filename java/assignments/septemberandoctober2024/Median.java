package assignments;

public class Median{

	public static void main(String[] args){

		int [] arr = {5, 3, 1, 4, 2, 13};
		int [] nums = {7, 9, 6, 8, 10, 12};


		int [] combined = new int [arr.length + nums.length];

		for(int i = 0; i < arr.length; i++){
			combined[i] = arr[i];
		}

		int index = 0;

		for(int i = arr.length; i < combined.length; i++){

			combined[i] = nums[index];
			index++;
		}


		for (int i = 0; i < combined.length; i++){

			for (int j = 1; j < combined.length; j++){

					int keeper = combined[j - 1];
				
				if (combined[j - 1] > combined[j]){
					
					combined[j-1] = combined [j];
					combined[j] = keeper;
					
				}

			}

		}

		double median = 0;

		if (combined.length % 2 == 0) {
			median = ((combined [combined.length / 2]) + (combined [(combined.length / 2) - 1]))/ 2.0;
		} else {
			median = combined [combined.length / 2];
		}

		
		
		
		System.out.print(median);
		

	}
}