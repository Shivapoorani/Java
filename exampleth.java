import java.io.*;
class A extends Thread{
public void run()
{
for (int i=0;i<=5;i++){
System.out.println(i);
}
}
}
class B extends Thread{
public void run1()
{
for (int j=0;j<=5;j++){
System.out.println(j);
}
}
}
class exampleth{
public static void main(String args[]){
 A ThreadA=new A();
ThreadA.start();
B ThreadB=new B();
ThreadB.start();
}
}