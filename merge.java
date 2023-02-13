import java.util.ArrayList;
public class merge{
public static ArrayList<Integer> mergeArrays(int[] arr1, int[] arr2){
ArrayList<Integer> result = new ArrayList<>();
int i = 0, j = 0;
while (i < arr1.length && j < arr2.length){
if (arr1[i] < arr2[j]){
result.add(arr1[i++]);
} 
else{
result.add(arr2[j++]);
}
}
while (i < arr1.length){
result.add(arr1[i++]);
}
while (j < arr2.length){
result.add(arr2[j++]);
}
return result;
}
public static void main(String[] args) {
int[] arr1 = {1, 3, 5, 7, 9};
int[] arr2 = {2, 4, 6, 8, 10};
ArrayList<Integer> result = mergeArrays(arr1, arr2);
System.out.println("Result: " + result);
}
}
