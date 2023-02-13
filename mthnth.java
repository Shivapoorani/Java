import java.util.Scanner;
public class mthnth{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the number of elements in the array: ");
int n = input.nextInt();
int[] numbers = new int[n];
System.out.println("Enter the elements of the array: ");
for (int i = 0; i < n; i++) {
numbers[i] = input.nextInt();
}
System.out.print("Enter the value of M: ");
int m = input.nextInt();
System.out.print("Enter the value of N: ");
int nValue = input.nextInt();
int mthMax = Integer.MIN_VALUE;
int nthMin = Integer.MAX_VALUE;
for (int i = 0; i < n; i++) {
if (numbers[i] > mthMax) {
mthMax = numbers[i];
}
if (numbers[i] < nthMin) {
nthMin = numbers[i];
}
}
for (int i = 1; i < m; i++) {
mthMax = Integer.MIN_VALUE;
for (int j = 0; j < n; j++) {
if (numbers[j] > mthMax && numbers[j] < nthMin) {
mthMax = numbers[j];
}
}
nthMin = mthMax;
}
int sum = mthMax + nthMin;
int difference = mthMax - nthMin;
System.out.println("The Mth maximum number is: " + mthMax);
System.out.println("The Nth minimum number is: " + nthMin);
System.out.println("The sum of Mth maximum and Nth minimum is: " + sum);
System.out.println("The difference of Mth maximum and Nth minimum is: " + difference);
}
}
