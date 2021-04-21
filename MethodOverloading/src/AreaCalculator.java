public class AreaCalculator {

    private static final double PI = Math.PI;

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return radius * radius * PI;
    }


}
