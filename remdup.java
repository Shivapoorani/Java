import java.util.Scanner;
public class remdup{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Enter the number of elements in the array:");
int n = scan.nextInt();
int[] arr = new int[n];
System.out.println("Enter the elements of the array:");
for (int i = 0; i < n; i++) {
arr[i] = scan.nextInt();
}
System.out.println("Array with duplicates removed:");
for (int i = 0; i < n; i++) {
boolean isDuplicate = false;
for (int j = 0; j < i; j++) {
if (arr[i] == arr[j]) {
isDuplicate = true;
break;
}
}
if (!isDuplicate) {
System.out.print(arr[i] + " ");
}
}
}
}
