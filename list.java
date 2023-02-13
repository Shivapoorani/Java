import java.io.*;
class A extends Thread{
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println(i+"*"+"5="+(i*5));
}
System.out.println("End of the 1st Thread");
}
}
class B extends Thread{
public void run()
{
for(int j=1;j<=10;j++)
{
System.out.println(j+"*"+"6="+(j*6));
}
System.out.println("End of the 2nd Thread");
}
}
class C extends Thread{
public void run()
{
for(int k=1;k<=10;k++)
{
System.out.println(k+"*"+"7="+(k*7));
}
System.out.println("End of the 3rd Thread");
}
}
class D extends Thread{
public void run()
{
for(int l=1;l<=10;l++)
{
System.out.println(l+"*"+"8="+(l*8));
}
System.out.println("End of the 4th Thread");
}
}
class E extends Thread{
public void run()
{
for(int m=1;m<=10;m++)
{
System.out.println(m+"*"+"9="+(m*9));
}
System.out.println("End of the 5th Thread");
}
}
class F extends Thread{
public void run()
{
for(int n=1;n<=10;n++)
{
System.out.println(n+"*"+"10="+(n*10));
}
System.out.println("End of the 6th Thread");
}
}
public class list{
public static void main(String[]args){
A ThreadA=new A();
B ThreadB=new B();
C ThreadC=new C();
D ThreadD=new D();
E ThreadE=new E();
F ThreadF=new F();
ThreadA.start();
ThreadB.start();
ThreadC.start();
ThreadD.start();
ThreadE.start();
ThreadF.start();
}
}
