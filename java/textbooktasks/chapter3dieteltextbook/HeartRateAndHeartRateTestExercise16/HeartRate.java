package chapter3dieteltextbook.HeartRateAndHeartRateTestExercise16;

public class HeartRate{
	
	private String firstName;
	
	private String lastName;

	private int dateOfBirthMonth;

	private int dateOfBirthDay;

	private int dateOfBirthYear;


	public HeartRate(String firstName, String lastName, int dateOfBirthDay, int dateOfBirthMonth, int dateOfBirthYear){
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirthDay = dateOfBirthDay;
		this.dateOfBirthMonth = dateOfBirthMonth;
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

	public void setDateOfBirthDay(int dateOfBirthDay){
			this.dateOfBirthDay = dateOfBirthDay;
	}

	public int getDateOfBirthDay(){
			return dateOfBirthDay;
	}

	public void setDateOfBirthMonth(int dateOfBirthMonth){
			this.dateOfBirthMonth = dateOfBirthMonth;
	}

	public int getDateOfBirthMonth(){
			return dateOfBirthMonth;
	}

	public void setDateOfBirthYear(int dateOfBirthYear){
			this.dateOfBirthYear = dateOfBirthYear;
	}

	public int getDateOfBirthYear(){
			return dateOfBirthYear;
	}

	
	public int getPersonAge(int currentYear){
		return currentYear - dateOfBirthYear;
	}

	public int getPersonMaximumHeartRate(int currentYear){
		return 220 - getPersonAge(currentYear);
	}

	public double getPersonTargetHeartRateRange1(int currentYear){
		int maximumHeartRate = getPersonMaximumHeartRate(currentYear);
		double range1 = 0.5 * maximumHeartRate;
		return range1;
	}

	public double getPersonTargetHeartRateRange2(int currentYear){
		int maximumHeartRate = getPersonMaximumHeartRate(currentYear);
		double range2 =  0.85 * maximumHeartRate;
		return range2;
	}

}