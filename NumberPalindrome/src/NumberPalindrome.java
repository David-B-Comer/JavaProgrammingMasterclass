public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int num = number;

        while (num != 0) {

            reverse = (num % 10) + (reverse * 10);
            num /= 10;
        }
        if (reverse == number) {
            return true;
        }
        return false;
    }

}
