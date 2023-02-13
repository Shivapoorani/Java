import java.util.Scanner;
class fibonacci {
public static void main(String[] args) 
{
int n, n1 = 0, n2 = 1;
Scanner s=new Scanner(System.in);
System.out.println("enter series count: ");
n=s.nextInt();
System.out.println("Fibonacci Series till " + n + " terms:");
for (int i = 1; i <= n; ++i) {
System.out.print(n1 + ", ");
int n3 = n1 + n2;
n1 = n2; 
n2 = n3;
}
}
}