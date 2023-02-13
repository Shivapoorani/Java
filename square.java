import java.util.Scanner;
class square
{
public static void main(String [] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter perfect square number:");
int n=s.nextInt();
int sqrt=(int) Math.sqrt(n);
if(sqrt*sqrt==n)
{
System.out.println("Perfect square number is"+sqrt);
}
else
{
System.out.println(n+" is not the perfect square number");
}
}
}
