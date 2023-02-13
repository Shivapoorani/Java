import java.util.Scanner;
class charindex{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.print("Enter a string: ");    
String inputString = scan.nextLine();
System.out.print("Enter a character: ");    
char charToFind = scan.next().charAt(0);    
boolean charFound = false;
for (int i = 0; i < inputString.length(); i++) {
if (inputString.charAt(i) == charToFind) {
System.out.println("The character '" + charToFind + "' was found at index " + i + ".");
charFound = true;
break;
}
}   
if (!charFound) {
System.out.println("The character '" + charToFind + "' was not found in the string.");
}
}
}
