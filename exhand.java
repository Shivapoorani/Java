import java.io.*;
class exhand{
public static void main(String args[]){
int x, y = 5, z = 0;
try{
x = y/z;
}
catch(ArithmeticException e){
System.out.println("Division by Zero");
}
finally{
System.out.println(y+z);
}
}
}