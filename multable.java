import java.util.Scanner;
public class multable {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number for the table (m): ");
    int m = input.nextInt();
    System.out.print("Enter the limit for the table (n): ");
    int n = input.nextInt();
    input.close();
    
    System.out.println("Multiplication table of " + m + ":");
    for (int i = 1; i <= n; i++) {
      System.out.println(m + " x " + i + " = " + m * i);
    }
  }
}