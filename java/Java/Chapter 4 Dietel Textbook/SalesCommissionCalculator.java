import java.util.Scanner;
public class SalesCommissionCalculator{
	public static void main(String[] args){
		double total = 0;
		int count = 0;
		String value = "";
		
		Scanner input = new Scanner(System.in);
		System.out.println("Which item did the sales representative sell last week?\n1. 239.99\n2. 129.75\n3. 99.95\n4. 350.89\n Enter a numerical value or -1 to exit: \n");
		int itemSold = input.nextInt();
		input.nextLine();
		while(itemSold != -1){
			switch(itemSold){
				case 1: 
					value = "239.99";
					total += 239.99;
					count += 1;
					break;
				case 2:
					value = "129.75";
					total += 129.75;
					count += 1;
					break;
				case 3:
					value = "99.95";
					total += 99.95;
					count += 1;
					break;
				case 4:
					value = "350.89";
					total += 350.89;
					count += 1;
					break;
				default:
					System.out.println("Invalid Input!!");
					break;
			}
			System.out.printf("The %d(st/nd/rd/th) item sold last week is at value %s%n", count, value);
			System.out.printf("The current total of item sold last week is %.2f%n", total);
			System.out.println("Which item did the sales representative sell last week?\n1. 239.99\n2. 129.75\n3. 99.95\n4. 350.89\n Enter a numerical value or -1 to exit: \n");
			itemSold = input.nextInt();
			input.nextLine();
		}
		double percentage = 9.0 / 100.0;
		double grossSalesNinePercent = percentage * total;
		System.out.printf("The calculated percentage is %.2f%n", percentage);
		System.out.printf("The calculated gross slaes nine percent is %.2f$%n", grossSalesNinePercent);

		int basePayment = 200;
		double salesCommission = basePayment + grossSalesNinePercent;
		System.out.printf("The calculated sales commission taken by the sales representative last week is %.2f$", salesCommission);
	}
}