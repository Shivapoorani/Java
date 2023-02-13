import java.util.Scanner;
class vote
{
public static void main(String [] args)
{
int a, age;
Scanner s=new Scanner(System.in);
System.out.println("enter age: ");
a=s.nextInt();
if(a>18)
{
System.out.println("eligible to vote");
}
else{
age=18-a;
System.out.println("eligible in "+age+" years");
}
}}