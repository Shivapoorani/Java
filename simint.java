import java.util.Scanner;
class simint
{
public static void main(String args[])
{
float p,t;
Scanner s=new Scanner(System.in);
System.out.println("Principle:");
p=s.nextFloat();
System.out.println("Time:");
t=s.nextFloat();
float si = (p*t) / 100;
System.out.println("Simple interest = " + si);
System.out.println("senior citizen(y/n): ");
String c=s.nextLine();
System.out.println("enter age:");
int age=s.nextInt();
if(age>12 && age<60)
{
si=si*(12/100);
System.out.println("simple interest:"+si);
}
else
{
si=si*(10/100);
System.out.println("simple interest:"+si);
}
}
}
