public class NumberToWords {

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int digitCount = 0;

        for (int i = 0; number > 0; i++) {
            number /= 10;
            digitCount++;
        }
        return digitCount;
    }
}
