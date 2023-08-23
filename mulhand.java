import java.io.*;
class mulhand{
public static void main(String args[]){
int x[] = {1,2,0,4};
try{
int y = x[0]+x[5]/x[2];
}
catch(ArithmeticException e){
System.out.println("Division by Zero");
}
catch(ArrayIndexOutOfBoundsException n){
System.out.println("Array is not Present");
}
finally{
System.out.println((x[3]+x[2])/x[1]);
}
}
}