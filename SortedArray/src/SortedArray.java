import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int number) {

        Scanner scanner = new Scanner(System.in);

        int[] intArray = new int[number];
        System.out.println("Enter " + number + " integers:");

        for (int i = 0; i < number; i++) {
            intArray[i] = scanner.nextInt();
        }
        scanner.close();

        return intArray;
    }
}
