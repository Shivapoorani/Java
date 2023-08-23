import java.io.*;
import java.Exception.*;

class MyExcep extends Exception{
MyExcep(int a){
d = a;
}
public String toString(){
return MyExcep("+d +");
}
}
class exp{
public void compute(int a)
throws MyExceps;
{
System.out.println("Called Compute("+a+")");
if (a > 10)
throw new MyExcep(int a)
System.out.println("Normal Exit");
}
public static void main(String args[]){
try{
compute(1);
compute(2);
}
catch(MyExcep e){
System.out.println("Exception Caught"+e);
}
}
}