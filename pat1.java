import java.util.Scanner;
class pat1{
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("Enter the Rows: ");
int rows = s.nextInt();
for(int i = 1; i <= rows; ++i) {
for(int j = 1; j <= i; ++j) {
System.out.print(" * ");
}
System.out.println();
}
}
}
