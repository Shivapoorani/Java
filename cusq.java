import java.util.Scanner;
class cusq
{
public static void main(String [] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter number:");
float n=s.nextFloat();
float sq=n*n;
float cu=n*n*n;
System.out.println("Square is "+sq);
System.out.println("Cube is "+cu);
}
}
