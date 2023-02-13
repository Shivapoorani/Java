import java.util.Scanner;
public class freq{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the size of the array: ");
int size = sc.nextInt();
int[] array = new int[size];
System.out.println("Enter the elements of the array: ");
for (int i = 0; i < size; i++) {
array[i] = sc.nextInt();
}
int[] frequency = new int[size];
for (int i = 0; i < size; i++) {
frequency[i] = -1;
}
for (int i = 0; i < size; i++) {
int count = 1;
for (int j = i + 1; j < size; j++) {
if (array[i] == array[j]) {
count++;
frequency[j] = 0;
}
}
if (frequency[i] != 0) {
frequency[i] = count;
}
}
System.out.println("\nFrequency of each element in the array:");
for (int i = 0; i < size; i++) {
if (frequency[i] != 0) {
System.out.println(array[i] + " occurs " + frequency[i] + " time(s).");
}
}
}
}
