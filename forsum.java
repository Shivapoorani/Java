import java.util.*;
class forsum{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter N: ");
int n=sc.nextInt();
int s=0;
for(int i=1;i<=n;i=i+1)
{
s=s+i;
}
System.out.println("Sum of N Natural Numbers are: "+s);
}
}