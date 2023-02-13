import java.util.Scanner;
class power
{
public static void main(String [] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("enter value:");
n=s.nextInt();
for(int i=0;i<n;i++)
if(n==i*i*i)
{
System.out.println("true");
}
else if(n!=i*i*i)
{
System.out.println("false");
}
}
}
