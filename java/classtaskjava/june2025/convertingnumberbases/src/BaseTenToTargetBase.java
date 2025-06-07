import java.util.ArrayList;
import java.util.Collections;

public class BaseTenToTargetBase {
    public int getTargetBaseConversion(int number, int targetBase) {
        if (targetBase < 2 || targetBase > 10) {
            throw new IllegalArgumentException("Target base must be between 2 and 10");
        }

        if (number == 0) {
            return 0;
        }

        ArrayList<Integer> digits = new ArrayList<>();
        int n = number;

        while (n > 0) {
            int remainder = n % targetBase;
            digits.add(remainder);
            n = n / targetBase;
        }

        Collections.reverse(digits);

        StringBuilder numberString = new StringBuilder();
        for (int digit : digits) {
            numberString.append(digit);
        }

        return Integer.parseInt(numberString.toString());
    }
}