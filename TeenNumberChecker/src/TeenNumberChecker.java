public class TeenNumberChecker {

    public static boolean hasTeen(int value1, int value2, int value3) {
        if (isTeen(value1) || isTeen(value2) || isTeen(value3)) {
            return true;
        }
        return false;
    }

}
