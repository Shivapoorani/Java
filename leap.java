import java.util.Scanner;
class leap
{
public static void main(String [] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter date: ");
int d=s.nextInt();
System.out.println("enter month: ");
int m=s.nextInt();
System.out.println("enter year: ");
int y=s.nextInt();
System.out.println(d+"/"+m+"/"+y);
if(y%4==0 || y%400==0)
{
System.out.println("It is a leap year");
}
else
{
System.out.println("It is not a leap year");
}
}
}