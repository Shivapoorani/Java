import java.util.Scanner;
class revnum{
public static void main(String [] args){
int a,b;
Scanner s=  new Scanner(System.in);
System.out.println("number: ");
a=s.nextInt();
b=0;
while(a != 0)
{
int temp=a%10;
b=b*10+temp;
a/=10;
}
System.out.println("reverse number: "+b);
}
}