public class NumberPalindrome {


    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221)
        );
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

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
