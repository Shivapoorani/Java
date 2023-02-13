import java.util.Scanner;
public class matdis{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the size of the matrix (NxN): ");
int n = sc.nextInt();
int[][] matrix = new int[n][n];
System.out.println("Enter the elements of the matrix:");
for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) {
matrix[i][j] = sc.nextInt();
}
}
System.out.println("The matrix is: ");
for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) {
System.out.print(matrix[i][j] + " ");
}
System.out.println();
}
System.out.println("The matrix row-wise: ");
for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) {
System.out.print(matrix[i][j] + " ");
}
System.out.println();
}
System.out.println("The matrix column-wise: ");
for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) {
System.out.print(matrix[j][i] + " ");
}
System.out.println();
}
}
}
