package classtaskjava;

public class GetIndex {

	public static String getIndexAvailable(int[] input, int search){
		for(int item = 0; item < input.length; item++){
			if(input[item] == search){
				return ""+item;
			}
		}
		return "not found";
	}


}