import java.util.Arrays;
public class sortvalues<T extends Comparable<T>> {
private T[] values;
public sortvalues(T[] values) {
this.values = values;
}
public void sort() {
Arrays.sort(values);
}
public T[] getValues() {
return values;
}
public static void main(String[] args) {
Integer[] intArray = {5, 2, 9, 1, 3};
sortvalues<Integer> intSort = new sortvalues<>(intArray);
intSort.sort();
System.out.println("Sorted integer values: " + Arrays.toString(intSort.getValues()));
String[] strArray = {"apple", "banana", "cherry", "date"};
sortvalues<String> strSort = new sortvalues<>(strArray);
strSort.sort();
System.out.println("Sorted string values: " + Arrays.toString(strSort.getValues()));
}
}