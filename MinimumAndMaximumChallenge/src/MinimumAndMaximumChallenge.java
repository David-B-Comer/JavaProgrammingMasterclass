import java.util.Scanner;

public class MinimumAndMaximumChallenge {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int minimum = 0;
            int maximum = 0;
            boolean first = true;

            while (true) {

                System.out.println("Enter number:");

                boolean isAnInt = scanner.hasNextInt();

                if (isAnInt) {

                    int number = scanner.nextInt();

                    if (first) {
                        first = false;
                        minimum = number;
                        maximum = number;
                    }

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
