import java.util.Scanner;
class recpat{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.print("Enter the symbol: ");
char symbol = scan.next().charAt(0);
System.out.print("Enter the number of rows: ");
int rows = scan.nextInt();
System.out.print("Enter the number of columns: ");
int columns = scan.nextInt();
for (int i = 0; i < rows; i++) {
for (int j = 0; j < columns; j++) {
System.out.print(symbol + " ");
}
System.out.println();
}
}
}
