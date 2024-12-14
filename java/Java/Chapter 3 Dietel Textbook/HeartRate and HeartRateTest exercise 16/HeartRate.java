public class HeartRate{
	
	private String firstName;
	
	private String lastName;

	private int dateOfBirthMonth;

	private int dateOfBirthDay;

	private int dateOfBirthYear;


	public HeartRate(String firstName, String lastName, int dateOfBirthDay, int dateOfBirthMonth, int dateOfBirthYear){
		if(firstName.matches("[a-zA-z]+")){
			this.firstName = firstName;
		}

		if(lastName.matches("[a-zA-z]+")){
			this.lastName = lastName;
		}

		this.dateOfBirthMonth = dateOfBirthMonth;
		this.dateOfBirthDay = dateOfBirthDay;
		this.dateOfBirthYear = dateOfBirthYear;
	}

	public void setFirstName(String firstName){
			this.firstName = firstName;

	}

	public String getFirstName(){
		return firstName;
	}
	
	public void setLastName(String lastName){
			this.lastName = lastName;
	}

	public String getLastName(){
			return lastName;
	}

	
	public int getPersonAge(int currentYear){
		return currentYear - dateOfBirthYear;
	}

	public int getPersonMaximumHeartRate(int currentYear){
		return 220 - getPersonAge(currentYear);
	}

	public int getPersonTargetHeartRateRange1(int currentYear){
		int maximumHeartRate = getPersonMaximumHeartRate(currentYear);
		int range1 = (50 / 100) * maximumHeartRate;
		return range1;
	}

	public int getPersonTargetHeartRateRange2(int currentYear){
		int maximumHeartRate = getPersonMaximumHeartRate(currentYear);
		int range2 = (85 / 100) * maximumHeartRate;
		return range2;
	}

}