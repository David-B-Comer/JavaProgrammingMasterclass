import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int elements = scanner.nextInt();
        System.out.println("Please enter " + elements + " numbers");
        scanner.nextLine();

        int[] returnedArray = readElements(elements);
        int returnedMin = findMin(returnedArray);

        System.out.println("Min = " + returnedMin);
    }

    private static int readInteger() {

        Scanner scanner = new Scanner(System.in);

        int elements = scanner.nextInt();
        scanner.close();

        return elements;
    }

    private static int[] readElements(int elements) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[elements];

        for (int i = 0; i < array.length; i++) {

            int element = scanner.nextInt();
            array[i] = element;
        }
        scanner.close();

        return array;
    }

    private static int findMin(int[] array) {
        int min = array[0];

        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

}
