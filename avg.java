import java.util.Scanner;
public class avg{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, positiveCount = 0, negativeCount = 0;
        double positiveSum = 0, negativeSum = 0;

        System.out.print("Enter a number (or -1 to stop): ");
        num = input.nextInt();

        while (num != -1) {
            if (num > 0) {
                positiveCount++;
                positiveSum += num;
            } else if (num < 0) {
                negativeCount++;
                negativeSum += num;
            }

            System.out.print("Enter a number (or -1 to stop): ");
            num = input.nextInt();
        }

        if (positiveCount > 0) {
            System.out.println("Average of positive numbers: " + (positiveSum / positiveCount));
        } else {
            System.out.println("No positive numbers were entered.");
        }

        if (negativeCount > 0) {
            System.out.println("Average of negative numbers: " + (negativeSum / negativeCount));
        } else {
            System.out.println("No negative numbers were entered.");
        }
    }
}
