import java.util.Scanner;
public class powerxn{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the base: ");
double x = scanner.nextDouble();
System.out.print("Enter the exponent: ");
int n = scanner.nextInt();
double result = pow(x, n);
System.out.println("Result: " + result);
}
public static double pow(double x, int n) {
double result = 1;
for (int i = 0; i < Math.abs(n); i++) {
result *= x;
}
if (n < 0) {
result = 1 / result;
}
return result;
}
}
