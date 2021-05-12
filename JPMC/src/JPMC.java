import java.util.Arrays;

public class JPMC {

    // list of integers
    // check if duplicate number exists
    public static void main(String[] args) {

        int[] numbers = {23, 3 , 5, 7, 99, 23, 11};

        System.out.println(isDuplicate(numbers));
    }

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


