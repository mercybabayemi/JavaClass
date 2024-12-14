public class Clock{
	
	private int hour ;

	private int minutes;

	private int seconds;

	public Clock(int hour, int minutes, int seconds){
		if( hour > 0 && hour < 24){
			this.hour = hour;
		}

		if(minutes > 0 && minutes < 60){
			this.minutes = minutes;
		}

		if(seconds > 0 && seconds < 60){
			this.seconds = seconds;
		}
	}

	public void setHour(int hour){
		if( hour > 0 && hour < 24){
			this.hour = hour;
		}
	}

	public int getHour(){
		return hour;
	}

	public void setMinutes(int hour){
		if(minutes > 0 && minutes < 60){
			this.minutes = minutes;
		}
	}

	public int getMinutes(){
		return minutes;
	}

	public void setSeconds(int hour){
		if(seconds > 0 && seconds < 60){
			this.seconds = seconds;
		}
	}

	public int getSeconds(){
		return seconds;
	}

	public String displayTime(){
		return String.format("%d:%d:%d", getHour(), getMinutes(), getSeconds());
	}

}