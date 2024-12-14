public class ClockTest{
	public static void main(String[] args){
	
		Clock firstTime = new Clock(12, 45, 29);

		Clock secondTime = new Clock(29, 58, 70);

		Clock thirdTime = new Clock(2, -4, 16 );

		System.out.println(firstTime.displayTime());

		System.out.println(secondTime.displayTime());

		System.out.println(thirdTime.displayTime());


	}
}