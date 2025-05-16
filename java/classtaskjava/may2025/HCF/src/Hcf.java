public class Hcf {
    public int getHcf(int... numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Numbers cannot be null or empty");
        }

        int hcf = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            hcf = calculateHcf(hcf, numbers[i]);
        }
        return hcf;
    }

    private int calculateHcf(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateHcf(b, a % b);
    }
}
