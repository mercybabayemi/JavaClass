import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class MenstrualApp {
    public static void main(String[] args) {
        getWelcomeMessage();
        Scanner input = new Scanner(System.in);
        String name = getUserName(input);
        displayIntroductoryMessage(name);

        System.out.println("Enter the start date of your last period (yyyy-MM-dd): ");
        String lastPeriodStartDate1 = input.nextLine();
        System.out.println("Enter the start date of your current period (yyyy-MM-dd): ");
        String currentPeriodStartDate1 = input.nextLine();
        LocalDate lastPeriodStartDate = LocalDate.parse(lastPeriodStartDate1);
        LocalDate currentPeriodStartDate = LocalDate.parse(currentPeriodStartDate1);

        getUserResponse(name, input, lastPeriodStartDate, currentPeriodStartDate);
    }

    public static void getWelcomeMessage() {
        System.out.println("Welcome to your ultimate menstrual calculator>>>");
    }

    public static String getUserName(Scanner input) {
        System.out.println("What is your name, user?");
        String userName = input.nextLine();
        return userName;
    }

    public static void displayIntroductoryMessage(String name) {
        System.out.printf("%s, There are three stages of a woman's menstrual cycle.\n1. Menstruation (Days 1-6): The uterus sheds its lining, resulting in bleeding (menstruation).\n2. Follicular Phase (Days 6-14): The body produces follicle-stimulating hormone (FSH), which stimulates the growth of follicles in the ovaries for ovaries to mature— these follicles contain your eggs.. These follicles produce estrogen, causing the uterine lining to thicken.\n3. Luteal Phase (Days 15-28): After ovulation, the empty follicle in the ovary produces progesterone, which helps thicken the uterine lining further. If pregnancy doesn't occur, the progesterone levels drop, and the cycle starts again.%n", name);
    }

    public static void getUserResponse(String name, Scanner input, LocalDate lastPeriodStartDate, LocalDate currentPeriodStartDate) {
        System.out.printf("%s, what would you like to calculate? %n1. Calculate flow date/Menstrual cycle %n2. Calculate next menstrual period. %n3. Calculate Ovulation date %n4. Fertile window/Safe period %n", name);
        int userResponse = input.nextInt();
        input.nextLine(); // Consume newline left-over
        switch (userResponse) {
            case 1:
                getFlowDate(lastPeriodStartDate, currentPeriodStartDate, input, name);
                break;
            case 2:
                getMenstrualDate(lastPeriodStartDate,currentPeriodStartDate, input,name);
                break;
            case 3:
                getOvulationDate(lastPeriodStartDate, currentPeriodStartDate, input, name);
		break;
            case 4:
                 getFertileDate(lastPeriodStartDate, currentPeriodStartDate, input, name);
                break;
            default:
                System.out.println("Invalid choice.\nPlease choose a valid option.");
        }
    }
    public static void getOvulationDate(LocalDate lastPeriodStartDate, LocalDate currentPeriodStartDate, Scanner input, String name) {
	System.out.println("Your ovulation date is " + currentPeriodStartDate.plusDays(14));
               
	System.out.printf("Do you wish to continue? %n1. Main Menu %n2. Exit%n");
	int response = input.nextInt();
	switch(response){
		case 1:
			getUserResponse(name, input, lastPeriodStartDate, currentPeriodStartDate);
			break;
		case 2:
			System.out.println("Thank you for using the app.\nWe hope to see you back soon.");
			break;
		}

	}

 public static void getFertileDate(LocalDate lastPeriodStartDate, LocalDate currentPeriodStartDate, Scanner input, String name) {
	System.out.println("Your fertile window or Safe period is " + currentPeriodStartDate.plusDays(9) + " to " + currentPeriodStartDate.plusDays(17));
               
	System.out.printf("Do you wish to continue? %n1. Main Menu %n2. Exit%n");
	int response = input.nextInt();
	switch(response){
		case 1:
			getUserResponse(name, input, lastPeriodStartDate, currentPeriodStartDate);
			break;
		case 2:
			System.out.println("Thank you for using the app.\nWe hope to see you back soon.");
			break;
		}

	}

	
public static void getMenstrualDate(LocalDate lastPeriodStartDate, LocalDate currentPeriodStartDate, Scanner input, String name) {
        long daysBetweenPeriods = ChronoUnit.DAYS.between(lastPeriodStartDate, currentPeriodStartDate);
	 System.out.println("Your next menstrual period date is " + currentPeriodStartDate.plusDays(daysBetweenPeriods));
          
	
	System.out.printf("Do you wish to continue? %n1. Main Menu %n2. Exit%n");
	int response = input.nextInt();
	switch(response){
		case 1:
			getUserResponse(name, input, lastPeriodStartDate, currentPeriodStartDate);
			break;
		case 2:
			System.out.println("Thank you for using the app.\nWe hope to see you back soon.");
			break;
		}


}

    public static long getFlowDate(LocalDate lastPeriodStartDate, LocalDate currentPeriodStartDate, Scanner input, String name) {
        long daysBetweenPeriods = ChronoUnit.DAYS.between(lastPeriodStartDate, currentPeriodStartDate);
        System.out.println("Your flow date is " + daysBetweenPeriods + " days");

        if (daysBetweenPeriods < 21) {
            System.out.println("You seem to have a short cycle also known as Polymenorrhea \nGo and see a doctor");
        } else if (daysBetweenPeriods > 21 && daysBetweenPeriods < 34) {
            System.out.println("You have a normal estimated cycle ");
        } else if (daysBetweenPeriods > 35) {
            System.out.println("You seem to have an abnormal cycle also known as Oligomenorrhea \nGo and see a doctor");
        } else if (daysBetweenPeriods > 50) {
            System.out.println("You do not have a menstrual cycle\n Go and see a doctor as soon as possible!!");
        } else if (daysBetweenPeriods <= 0) {
            System.out.println("Invalid dates inputed!!");
        }

	System.out.printf("Do you wish to continue? %n1. Main Menu %n2. Exit%n");
	int response = input.nextInt();
	switch(response){
		case 1:
			getUserResponse(name, input, lastPeriodStartDate, currentPeriodStartDate);
			break;
		case 2:
			System.out.println("Thank you for using the app.\nWe hope to see you back soon.");
			break;
		}

	return daysBetweenPeriods;
	}
}