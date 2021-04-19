public class DecimalComparator {

    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        areEqualByThreeDecimalPlaces(3.175, 3.176);
    }
    public static boolean areEqualByThreeDecimalPlaces(double value1, double value2) {

        if ((int) (value1 * 1000) == (int) (value2 * 1000)) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}
