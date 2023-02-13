import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class revalp{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a word: ");
String word = sc.nextLine();
char[] wordArray = word.toCharArray();
Arrays.sort(wordArray);
Collections.reverse(Arrays.asList(wordArray));
System.out.println("Reverse Alphabetical Order: " + String.valueOf(wordArray));
}
}
