public class LastDigitChecker {



    public static boolean isValid(int number) {
        if ((number >= 10) && (number <= 1000)) {
            return true;
        }
        return false;
    }
}
