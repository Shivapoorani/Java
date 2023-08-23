import java.lang.*;
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
class C extends Thread{
public void run1()
{
for (int k=0;k<4;k++){
System.out.println(k);
}
}
}
class setprior{
public static void main(String args[]){
 A a=new A();
B b=new B();
C c=new C();
a.setPriority(Thread.NORM_PRIORITY);
b.setPriority(Thread.MIN_PRIORITY);
c.setPriority(Thread.MAX_PRIORITY);
a.start();
b.start();
c.start();

}
}