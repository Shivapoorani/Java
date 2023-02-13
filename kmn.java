import java.util.Scanner;
public class kmn{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the starting number (M): ");
int m = input.nextInt();
System.out.print("Enter the ending number (N): ");
int n = input.nextInt();
System.out.print("Enter the number of numbers to be skipped (K): ");
int k = input.nextInt();
input.close();
for (int i = m; i <= n; i += k + 1) {
System.out.println(i);
}
}
}
