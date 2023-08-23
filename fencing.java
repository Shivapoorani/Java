import java .io.*;
class one{
int f = 600;
void display(){
System.out.println("Fencing Cost Per Square Feet: "+f);
}
}
class two extends one{
int l=60;
int b=40;
void display1(){
System.out.println("The Circumference of the Fencing is: " + (2*(l+b)));
}
}
class fencing{
public static void main(String args[]){
two a = new two();
a.display();
a.display1();
}
}