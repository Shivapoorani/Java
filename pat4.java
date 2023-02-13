import java.util.Scanner;
class pat4{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Rows: ");
int row=sc.nextInt();
for(int i = row; i >= 1; --i) {
for(int space = 1; space <= row - i; ++space) {
System.out.print("  ");
}
for(int j=i; j <= 2 * i - 1; ++j) {
System.out.print("* ");
}
for(int j = 0; j < i - 1; ++j) {
System.out.print("* ");
}
System.out.println();
}
}
}