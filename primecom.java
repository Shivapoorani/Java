import java.util.Scanner;
public class primecom {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int primeCounter = 0;
int compositeCounter = 0;
System.out.print("Enter the number of integers: ");
int n = sc.nextInt();
System.out.println("Enter " + n + " integers: ");
for (int i = 0; i < n; i++) {
int num = sc.nextInt();
if (isPrime(num)) {
primeCounter++;
} 
else {
compositeCounter++;
}
}
System.out.println("Number of prime numbers: " + primeCounter);
System.out.println("Number of composite numbers: " + compositeCounter);
sc.close();
}
public static boolean isPrime(int num) {
if (num <= 1) {
return false;
}
for (int i = 2; i < num; i++) {
if (num % i == 0) {
return false;
}
}
return true;
}
}
