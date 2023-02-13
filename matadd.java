import java.util.Scanner;
class matadd{
public static void main(String[] args){
int row1,col1,row2,col2;
Scanner s=new Scanner(System.in);
System.out.println("enter number of rows for 1 matrix");
row1=s.nextInt();
System.out.println("enter number of coloumns for 1 matrix");
col1=s.nextInt();
System.out.println("enter number of rows for 2 matrix");
row2=s.nextInt();
System.out.println("enter number of coloumns for 2 matrix");
col2=s.nextInt();
if(col1 !=row2){
System.out.println("Matrix multiplication is not possible");
return;
}
int a[][]=new int[row1][col1];
int b[][]=new int[row2][col2];
int c[][]=new int[row1][col2];
System.out.println("\nEnter values for matrix A:");
for(int i=0;i<row1;i++){
for(int j=0;j<col1;j++) a[i][j]=s.nextInt();
}
System.out.println("\nEnter values for matrix B:");
for(int i=0;i<row2;i++){
for(int j=0;j<col2;j++) b[i][j]=s.nextInt();
}
System.out.println("\nMatrix multiplication is:");
for(int i=0;i<row1;i++){
for(int j=0;j<col2;j++) {
c[i][j] +=a[i][j] + b[i][j];
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}
}