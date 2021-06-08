import java.util.Scanner;

public class MinimumElement {

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

}
