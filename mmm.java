import java.util.*;
public class mmm{
public static void main(String[] args){
int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1};
int n = arr.length;
System.out.println("Mean: " + findMean(arr, n));
System.out.println("Median: " + findMedian(arr, n));
System.out.println("Mode: " + findMode(arr, n));
}
public static double findMean(int[] arr, int n){
int sum = 0;
for (int i = 0; i < n; i++) {
sum += arr[i];
}
return (double)sum / n;
}
public static double findMedian(int[] arr, int n) {
Arrays.sort(arr);
if (n % 2 != 0) {
return (double)arr[n / 2];
}
return (double)(arr[(n - 1) / 2] + arr[n / 2]) / 2.0;
}
public static int findMode(int[] arr, int n) {
int maxValue = 0, maxCount = 0;
for (int i = 0; i < n; i++){
int count = 0;
for (int j = 0; j < n; j++){
if (arr[j] == arr[i]){
count++;
}
}
if (count > maxCount){
maxCount = count;
maxValue = arr[i];
}
}
return maxValue;
}
}
