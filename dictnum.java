import java.util.Scanner;
public class dictnum{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Enter the length of the array:");
int n = scan.nextInt();
int[] nums = new int[n];
System.out.println("Enter the elements of the array:");
for (int i = 0; i < n; i++) {
nums[i] = scan.nextInt();
}
int missingNumber = missingNumber(nums);
System.out.println("The missing number is: " + missingNumber);
}
public static int missingNumber(int[] nums) {
int n = nums.length;
int expectedSum = n * (n + 1) / 2;
int actualSum = 0;
for (int num : nums) {
actualSum += num;
}
return expectedSum - actualSum;
}
}
