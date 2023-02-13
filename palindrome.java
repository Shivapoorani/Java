import java.util.Scanner;

public class palindrome{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 to check a string palindrome or 2 to check a number palindrome: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Enter a string: ");
            String str = scanner.next();
            if (isPalindromeString(str)) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }
        } else if (choice == 2) {
            System.out.println("Enter a number: ");
            int num = scanner.nextInt();
            if (isPalindromeNumber(num)) {
                System.out.println("The number is a palindrome.");
            } else {
                System.out.println("The number is not a palindrome.");
            }
        } else {
            System.out.println("Invalid choice.");
        }
    }

    private static boolean isPalindromeString(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindromeNumber(int num) {
        int originalNum = num;
        int reverseNum = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            num /= 10;
        }
        return originalNum == reverseNum;
    }
}
