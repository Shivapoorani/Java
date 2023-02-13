import java.util.Scanner;
public class composite{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.print("Enter the size of the array: ");
int n = scan.nextInt();
int[] array = new int[n];
System.out.println("Enter the elements of the array: ");
for (int i = 0; i < n; i++) {
array[i] = scan.nextInt();
}
int compositeCount = 0;
for (int i = 0; i < n; i++) {
if (isComposite(array[i])) {
compositeCount++;
}
}
System.out.println("Number of composite numbers in the array: " + compositeCount);
}
public static boolean isComposite(int n) {
if (n <= 1) {
return false;
}
for (int i = 2; i <= Math.sqrt(n); i++) {
if (n % i == 0) {
return true;
}
}
return false;
}
}
