import java.util.Arrays;
public class nthlar{
public static int findNthLargestNumber(int[] array, int n) {
if (array == null || array.length == 0 || n < 1 || n > array.length) {
throw new IllegalArgumentException("Invalid input");
}
Arrays.sort(array);
return array[array.length - n];
}
public static void main(String[] args) {
int[] array = {14, 67, 48, 23, 5, 62};
int n = 4;
System.out.println("The " + n + "th largest number in the array is: " + findNthLargestNumber(array, n));
}
}
