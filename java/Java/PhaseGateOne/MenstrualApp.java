import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class MenstrualApp{
	public static void main(String[] args){
		getWelcomeMessage();
		Scanner input =  new Scanner(System.in);
		String name = getUserName(input);
		displayIntroductoryMessage(name);


		System.out.print("Enter last start date(dd,MM,yyyy): ");
		String lastStartDate = input.nextLine();

		System.out.print("Enter current start date(dd,MM,yyy): ");
		String currentStartDate = input.nextLine();

		DateTimeFormatter date = DateTimeFormatter.ofPattern("ddMMyyyy");

		LocalDate lastPeriodStartTime = LocalDate.parse(lastStartDate,date);
		LocalDate currentPeriodStartTime = LocalDate.parse(currentStartDate,date);

		getUserResponse(name, input, lastPeriodStartTime, currentPeriodStartTime);
	}
	
	public static void getWelcomeMessage(){
		System.out.println("Welcome to your ultimate menstrual calculator>>>");
	}

	public static String getUserName(Scanner input){
		System.out.println("What is your name,user?");
		String userName = input.nextLine();
		return userName;
	}
	public static void displayIntroductoryMessage(String name){
		System.out.printf("%s, There are three phases/stages of a woman's menstrual cycle.\n1. Menstruation (Days 1-5): The uterus sheds its lining, resulting in bleeding (menstruation).\n2. Follicular Phase (Days 6-14): The body produces follicle-stimulating hormone (FSH), which stimulates the growth of follicles in the ovaries for ovaries to mature— these follicles contain your eggs.. These follicles produce estrogen, causing the uterine lining to thicken.\n3. Luteal Phase (Days 15-28): After ovulation, the empty follicle in the ovary produces progesterone, which helps thicken the uterine lining further. If pregnancy doesn't occur, the progesterone levels drop, and the cycle starts again.%n", name);

	}

	public static int getUserResponse(String name, Scanner input,LocalDate lastPeriodStartTime, LocalDate currentPeriodStartTime){
		System.out.printf("%s, what would you like to calculate? %n1. Calculate flow date/Menstrual cycle %2. Calculate next menstrual period. %n3. Calculate Ovulation date %n4. Fertile window/Safe period %n5. Calculate the luteal phase%n", name);
		int userResponse = input.nextInt();
		switch(userResponse){
			case 1:
				System.out.println(getFlowDate(lastPeriodStartTime, currentPeriodStartTime,input,name));
				break;
			case 2:
				System.out.println("ovulation date");
				break;
			case 3:
				System.out.println("fertile window");
				break;
			case 4:
				System.out.println("lutheal phase");
				break;
			case 5: 
				System.out.println("Exit");
				break;
			case 6: 
				System.out.print("");
				break;
			}
		return userResponse;
	}

	public static long getFlowDate(LocalDate lastPeriodStartTime, LocalDate currentPeriodStartTime,Scanner input, String name){
		long daysBetweenPeriod = ChronoUnit.DAYS.between(lastPeriodStartTime,currentPeriodStartTime);
		System.out.println("Your flow date is : " + daysBetweenPeriod);

		if(daysBetweenPeriod < 21){
			System.out.println("You seem to have a short cycle also known as Polymenorrhea \nGo and see a doctor");
		}
		else if (daysBetweenPeriod > 35) {
			System.out.println("You seem to have an abnormal cycle also known as Oligomenorrhea \nGo and see a doctor");
		}
		else if (daysBetweenPeriod > 50) {
			System.out.println("You do not have a nmenstrual cycle\n Go and see a doctor as soon as possible!!");
		}
		else if (daysBetweenPeriod >= 0) {
			System.out.println("Invalid dates inputed!!");
		}

		System.out.printf("Do you wish to continue? %n1. Main Menu %n2. Exit");
		int response = input.nextInt();
		switch(response){
			case 1:
				System.out.println(getUserResponse(name, input, lastPeriodStartTime, currentPeriodStartTime));
				break;
			case 2:
				getExit();
				break;
		}
		return daysBetweenPeriod;
	}

	public static void getExit(){
		System.out.println("Thank you for using the app.\nWe hope to see you back soon.");
	}
}