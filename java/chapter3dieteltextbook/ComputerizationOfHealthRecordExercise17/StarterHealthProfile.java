package Chapter3DietelTextbook.ComputerizationOfHealthRecordExercise17;

public class StarterHealthProfile{
	private String firstName;

	private String lastName;

	private String gender;

	private int dateOfBirthMonth;

	private int dateOfBirthDay;

	private int dateOfBirthYear;

	private double heightInInches;

	private double weightInPounds;

	public StarterHealthProfile(String firstName, String lastName, String gender, int dateOfBirthDay, int dateOfBirthMonth, int dateOfBirthYear, double heightInInches, double weightInPounds){
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirthDay = dateOfBirthDay;
		this.dateOfBirthMonth = dateOfBirthMonth;
		this.dateOfBirthYear = dateOfBirthYear;
		this.heightInInches = heightInInches;
		this.weightInPounds = weightInPounds;
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

	public void setGender(String gender){
		this.gender = gender;
	}

	public String getGender(){
		return gender;
	}

	public void setHeight(double heightInInches){
		this.heightInInches = heightInInches;
	}

	public double getHeight(){
		return heightInInches;
	}

	public void setWeight(double weightInPounds){
		this.weightInPounds = weightInPounds;
	}

	public double getWeight(){
		return weightInPounds;
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

	public double getBodyMassIndex(){
		return (double)((weightInPounds * 703) / (heightInInches * heightInInches)); 
	}
}