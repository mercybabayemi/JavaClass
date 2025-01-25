import java.util.Arrays;

public class Merge{

	public static void main(String[] args){

		int [] arr = {5, 3, 1, 4, 2, 13};
		int [] nums = {7, 9, 6, 8, 10, 12};


		int [] merge  = new int [arr.length + nums.length];

		for(int i = 0; i < arr.length; i++){
			merge[i] = arr[i];
		}

		int index = 0;

		for(int i = arr.length; i < merge.length; i++){

			merge[i] = nums[index];
			index++;
		}
	Arrays.sort(merge);
	System.out.print(Arrays.toString(merge));
}
}