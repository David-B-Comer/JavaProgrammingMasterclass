import java.util.Arrays;

public class JPMC {

    // list of integers
    // check if duplicate number exists


    public static boolean isDuplicate(int[] numbers) {

        if (numbers == null) {
            return false;
        }

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == (numbers[i + 1])) {
                return true;
            }
        }
        return false;
    }
}


