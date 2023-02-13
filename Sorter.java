import java.util.Scanner;
public class Sorter<T extends Comparable<T>> {
public void sort(T[] values) {
for (int i = 0; i < values.length; i++) {
for (int j = i + 1; j < values.length; j++) {
if (values[i].compareTo(values[j]) > 0) {
T temp = values[i];
values[i] = values[j];
values[j] = temp;
}
}
}
}
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Enter the size of the array: ");
int size = scan.nextInt();
scan.nextLine();
System.out.println("Enter the type of values to sort (Integer/String): ");
String type = scan.nextLine();
if (type.equalsIgnoreCase("integer")) {
Integer[] values = new Integer[size];
System.out.println("Enter the values: ");
for (int i = 0; i < size; i++) {
values[i] = scan.nextInt();
}
Sorter<Integer> sorter = new Sorter<>();
sorter.sort(values);
System.out.println("Sorted values: ");
for (Integer value : values) {
System.out.println(value);
}
} 
else if (type.equalsIgnoreCase("string")) {
String[] values = new String[size];
System.out.println("Enter the values: ");
for (int i = 0; i < size; i++) {
values[i] = scan.nextLine();
}
Sorter<String> sorter = new Sorter<>();
sorter.sort(values);
System.out.println("Sorted values: ");
for (String value : values) {
System.out.println(value);
}
} 
else {
System.out.println("Invalid type entered. Only Integer and String are supported.");
}
scan.close();
}
}
