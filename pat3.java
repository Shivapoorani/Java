import java.util.Scanner;
class pat3{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
System.out.print("Enter the Number to be printed: ");
int n = in.nextInt();
System.out.print("Enter the Rows: ");
int row = in.nextInt();
for (int i = n; i <= row; i++) {
for (int j = n; j <= i; j++) {
System.out.print(n);
}
System.out.println();
}
for (int i = row-1; i >= n; i--) {
for (int j = n; j <= i; j++) {
System.out.print(n);
}
System.out.println(" ");
}
}
}
