import java.util.Scanner;

public class simplearithmeticoperations {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int a = sc.nextInt();
    System.out.print("Enter the second number: ");
    int b = sc.nextInt();

    try {
      int sum = a + b;
      int difference = a - b;
      int product = a * b;
      int quotient = a / b;
      int remainder = a % b;

      System.out.println("Sum: " + sum);
      System.out.println("Difference: " + difference);
      System.out.println("Product: " + product);
      System.out.println("Quotient: " + quotient);
      System.out.println("Remainder: " + remainder);
    } catch (ArithmeticException e) {
      System.out.println("Division by zero is not allowed.");
    }
  }
}
