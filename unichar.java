import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class unichar{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a string: ");
String input = scanner.nextLine();
Set<Character> uniqueChars = new HashSet<>();
for (int i = 0; i < input.length(); i++) {
char c = input.charAt(i);
if (!uniqueChars.contains(c)) {
uniqueChars.add(c);
}
}
System.out.println("Unique characters in the given string: ");
for (Character c : uniqueChars) {
System.out.print(c + " ");
}
}
}
