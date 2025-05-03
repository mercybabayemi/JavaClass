import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {
    private static final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] romanLiterals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String toRoman(int number) {
        try {
            StringBuilder roman = new StringBuilder();
            for (int i = 0; i < values.length; i++) {
                while (number >= values[i]) {
                    number -= values[i];
                    roman.append(romanLiterals[i]);
                }
            }
            return roman.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
