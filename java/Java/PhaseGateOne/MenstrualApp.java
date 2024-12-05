import java.util.Scanner;
public class MenstrualApp{
	public static void main(String[] args){
		getWelcomeMessage();
		Scanner input =  new Scanner(System.in);
		String name = getUserName(input);
		displayIntroductoryMessage(name);
		getUserResponse(name, input);
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

	public static void getUserResponse(String name, Scanner input){
		System.out.printf("What would you like to calculate? %n1. Calculate next menstrual period. %n2. Calculate Ovulation date %n3. Fertile window/Safe period %n4. Calculate the luteal phase%n", name);
		int userResponse = input.nextInt();
		switch(userResponse){
			case 1:
				System.out.println("next menstrual app");
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
			}
	}


}