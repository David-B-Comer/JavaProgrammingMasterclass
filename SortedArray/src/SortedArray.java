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

    public static void printArray(int[] intArray) {

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Element " + i + " contents " + intArray[i]);
        }
    }

    public static int[] sortIntegers(int[] intArray) {

    for (int i = 0; i < intArray.length; i++) {
        for (int j = i + 1; j < intArray.length; j++) {

            if (intArray[i] < intArray[j]) {
                int temp = intArray[i];
                intArray[i] = intArray[j];
                intArray[j] = temp;
            }
        }
    }
    return intArray;
    }

}
