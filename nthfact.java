import java.util.Scanner;
public class nthfact{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a Number: ");
int num = input.nextInt();
int count = 0;
for (int i = 1; i <= num; i++) {
if (num % i == 0) {
count++;
}
}
System.out.println("Number of Factors: " + count);
System.out.print("Enter the Nth Factor to be Found: ");
int n = input.nextInt();
int f = 0;
for (int i = 1; i <= num; i++) {
if (num % i == 0) {
f++;
}
if (f == n) {
System.out.println("The Nth Factor is: " + i);
break;
}
}
}
}
