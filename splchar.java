import java.util.Scanner;

public class splchar{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int upperCount = 0;
        int lowerCount = 0;
        int digitCount = 0;

        System.out.println("Enter characters (type * to stop):");

        while (true) {
            char ch = scan.next().charAt(0);
            if (ch == '*') {
                break;
            }
            if (Character.isUpperCase(ch)) {
                upperCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        System.out.println("Number of uppercase characters: " + upperCount);
        System.out.println("Number of lowercase characters: " + lowerCount);
        System.out.println("Number of digits: " + digitCount);

        scan.close();
    }
}
