public class GivenBaseToBaseTenFirst {
    public int getBaseTen(int number, int base) {
        String numberAsString = String.valueOf(number);
        int total = 0;
        int length = numberAsString.length();
        int count = 0;
        int i = 0;
        while (count != length) {
            char currentChar = numberAsString.charAt(length - 1);
            double currentCalculation = (double) Integer.parseInt(String.valueOf(currentChar)) * Math.pow(base,  i);
            total += (int) currentCalculation;
            length--;
            i++;
        }
        return total;
    }
}
