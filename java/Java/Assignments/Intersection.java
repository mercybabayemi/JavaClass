import java.util.Arrays;

public class Intersection{

	public static void main(String[] args){

	int[] arr = {1,2,3,4};
	int[] nums = {3,4,5,6};


	int index = 0;

	for(int i = 0; i < arr.length; i++){
		for(int j = 0; j < nums.length; j++){
			if(arr[i] == nums[j]){
			System.out.print(nums[j] + " ");
			}
		}
	}

}
}