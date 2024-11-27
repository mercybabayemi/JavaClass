public class TwoPrime{
	public static void main(String[] args){
	
	System.out.print(get_count(7));

	System.out.print(get_count(7));
	}

	public static int get_count(int integer){
		int count = 0;
		for(int i = 1; i < integer; i++){
			count++;
		}
		return count;
	}

	public static int[] primeNumber(int integer){
		int count = 3;
		int[] result = new int[get_count(integer)];
		for(int i = 1; i < integer; i ++){
			if(integer < 2) result[i] = 2;
			if(integer == 2) result += 2;
			else while(count <=  integer-1){
				if(integer % count == 0) result += integer[i];
					count++;
			}
		}
		return result;
	}

}