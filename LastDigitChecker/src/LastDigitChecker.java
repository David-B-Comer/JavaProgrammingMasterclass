public class LastDigitChecker {

    public static boolean hasSameLastDigit(int n1, int n2, int n3) {

        if (!isValid(n1) || !isValid(n2) || !isValid(n3)) {
            return false;
        }
        int rightDigit1 = n1 % 10;
        int rightDigit2 = n2 % 10;
        int rightDigit3 = n3 % 10;

        if ((rightDigit1 == rightDigit2) || (rightDigit1 == rightDigit3) || (rightDigit2 == rightDigit3)) {
            return true;
        }
        return false;
    }


    public static boolean isValid(int number) {
        if ((number >= 10) && (number <= 1000)) {
            return true;
        }
        return false;
    }
}
