import java.util.Scanner;
public class operation{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string: ");
String inputString = sc.nextLine();
String replacedString = inputString.replace("Saveetha", "XYZ");
System.out.println("Replaced string: " + replacedString);
int length = inputString.length();
System.out.println("Length of the string: " + length);
String upperCaseString = inputString.toUpperCase();
System.out.println("Uppercase string: " + upperCaseString);
}
}
