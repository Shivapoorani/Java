import java.util.Scanner;
public class matmul{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of rows for the first matrix: ");
int rowsA = sc.nextInt();
System.out.print("Enter the number of columns for the first matrix: ");
int colsA = sc.nextInt();
System.out.print("Enter the number of rows for the second matrix: ");
int rowsB = sc.nextInt();
System.out.print("Enter the number of columns for the second matrix: ");
int colsB = sc.nextInt();
if (colsA != rowsB) {
System.out.println("The matrices can't be multiplied with each other.");
return;
}
int[][] matrixA = new int[rowsA][colsA];
int[][] matrixB = new int[rowsB][colsB];
int[][] result = new int[rowsA][colsB];
System.out.println("Enter the elements of the first matrix:");
for (int i = 0; i < rowsA; i++){
for (int j = 0; j < colsA; j++){
matrixA[i][j] = sc.nextInt();
}
}
System.out.println("Enter the elements of the second matrix:");
for (int i = 0; i < rowsB; i++) {
for (int j = 0; j < colsB; j++) {
matrixB[i][j] = sc.nextInt();
}
}
for (int i = 0; i < rowsA; i++) {
for (int j = 0; j < colsB; j++) {
for (int k = 0; k < colsA; k++) {
result[i][j] += matrixA[i][k] * matrixB[k][j];
}
}
}
System.out.println("The result of the matrix multiplication is:");
for (int i = 0; i < rowsA; i++) {
for (int j = 0; j < colsB; j++) {
System.out.print(result[i][j] + " ");
}
System.out.println();
}
}
}
