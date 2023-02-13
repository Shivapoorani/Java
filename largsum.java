import java.util.Scanner;
public class largsum{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of elements in the array: ");
int n = sc.nextInt();
int[] nums = new int[n];
System.out.println("Enter the elements of the array: ");
for (int i = 0; i < n; i++) {
nums[i] = sc.nextInt();
}
int maxSum = Integer.MIN_VALUE;
int currentSum = 0;
for (int i = 0; i < n; i++) {
currentSum += nums[i];
if (currentSum > maxSum) {
maxSum = currentSum;
}
if (currentSum < 0) {
currentSum = 0;
}
}
System.out.println("The largest sum of a subarray is: " + maxSum);
}
}
