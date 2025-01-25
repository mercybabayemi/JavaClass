import java.math.BigDecimal;
import java.util.Scanner;
public class HugeInteger{
	public static void main(String[] args){
		BigDecimal[] bigDecimalDigit = new BigDecimal[40];

		Scanner input = new Scanner(System.in);
	
		for(int loop = 0; loop < bigDecimalDigit.length; loop++){
			System.out.println("Enter a 40 digit: ");
			String value = input.nextLine();

			if(value.length() < 40){
				System.out.println("Enter a valid 40 digit: ");
				value = input.nextLine();
			}

			bigDecimalDigit[loop] = getParsedValue(value);
		}
		
	}

	public static BigDecimal getParsedValue(String input){
		BigDecimal valueParsed = new BigDecimal(input);
		return valueParsed;
	}

	public static BigDecimal getBigDecimalAddition(BigDecimal first, BigDecimal second){
		BigDecimal result = first.add(second);
		return result;
	}

	public static BigDecimal getBigDecimalSubtraction(BigDecimal first, BigDecimal second){
		BigDecimal result = first.subtract(second);
		return result;
	}

}