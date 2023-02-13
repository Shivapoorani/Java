import java.util.Scanner;
public class pat5{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.print("Enter the Character to be printed: ");
char character = scan.next().charAt(0);
System.out.print("Max Number of time printed: ");
int rows = scan.nextInt();
for (int i = 1; i <= rows; i++) {
for (int j = 1; j <= i; j++) {
System.out.print(character + " ");
}
System.out.println();
}
}
}
