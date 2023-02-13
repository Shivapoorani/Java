import java.util.Scanner;
public class factrec{
static int factorial(int n) {
if (n == 0)
return 1;
else
return (n * factorial(n - 1));
}
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a number to find its factorial: ");
int num = input.nextInt();
int result = factorial(num);
System.out.println("The factorial of " + num + " is " + result);
}
}
