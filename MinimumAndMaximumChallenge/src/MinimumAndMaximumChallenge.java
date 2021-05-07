import java.util.Scanner;

public class MinimumAndMaximumChallenge {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int minimum = Integer.MAX_VALUE;
            int maximum = Integer.MIN_VALUE;

            while (true) {

                System.out.println("Enter number:");

                boolean isAnInt = scanner.hasNextInt();

                if (isAnInt) {

                    int number = scanner.nextInt();

                    if (number > maximum) {
                        maximum = number;
                    }

                    if (number < minimum) {
                        minimum = number;
                    }

                } else {
                    break;
                }
                scanner.nextLine();
            }

            System.out.println("Minimum = " + minimum + ", Maximum = " + maximum);
            scanner.close();
    }
}
