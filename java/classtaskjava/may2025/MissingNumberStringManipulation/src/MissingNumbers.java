import java.util.Arrays;

public class MissingNumbers {
    public Integer getMissingNumber(String characters){
        try {
            String[] stringArray = characters.trim().split(",");
            int[] intArray = Arrays.stream(stringArray)
                    .mapToInt(Integer::parseInt)
                    .sorted().
                    toArray();
            int sum = 0;
            System.out.println("sum is now " + sum);
            for (int i = intArray[0]; i <= intArray[intArray.length - 1]; i++) {
                boolean found = false;
                for (int num : intArray) {
                    if (num == i) {
                        found = true;
                        System.out.println("current number " + i + " found.");
                        break;
                    }
                }
                if (!found) {
                    System.out.println(i + " not found");
                    sum += i;
                    System.out.println("sum now " + sum);
                }
            }
            return sum;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Input contains non-numeric values", e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
