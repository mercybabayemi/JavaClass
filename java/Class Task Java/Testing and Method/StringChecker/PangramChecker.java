public class PangramChecker{
	public static boolean isCharacterPresent(String user_input){

		boolean isAllPresent = true;
		boolean isPresent = false;

		int length = user_input.length();
		if(length < 26) return false;
		
		for(char letter = 'a'; letter <= 'z'; letter++){
			
			for(int index = 0; index < user_input.length(); index++){
				
				if(letter == user_input.toLowerCase().charAt(index)){
					
					isPresent = true;
					
					break;
				}
			}
			if(!isPresent){
				
				isAllPresent = false;
				
				break;
			}
		} isPresent = false;

		return isAllPresent;
	}

}