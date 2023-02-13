import java.util.Scanner;
public class sumofnum{
public static void main(String[] args) {
int i;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of elements: ");
int n = sc.nextInt();
int[] numbers = new int[n];
System.out.println("Enter the elements: ");
for (i = 0; i < n; i++) {
numbers[i] = sc.nextInt();
}
int sum = 0;
try {
for (i = 0; i <= n; i++) {
sum += numbers[i];
}
} 
catch (ArrayIndexOutOfBoundsException e) {
System.out.println("ArrayIndexOutOfBoundsException: Index " + i + " is out of range.");
}
System.out.println("Sum of numbers: " + sum);
}
}
