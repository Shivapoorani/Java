import java.util.Arrays;
public class misarr{
public static void main(String[] args) {
int[] a = {1, 4, 5, 3, 7, 8, 6};
int n = 8;
int expectedSum = n * (n + 1) / 2;
int actualSum = Arrays.stream(a).sum();
int missingNumber = expectedSum - actualSum;
System.out.println("The missing number is: " + missingNumber);
}
}
