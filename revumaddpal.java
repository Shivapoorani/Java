import java.util.Scanner;
class revumaddpal{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number: ");
int n=sc.nextInt();
int sum=0;
int b=0;
while(n != 0){
int temp=n%10;
b=b*10+temp;
n/=10;
}
System.out.println("Reverse Number: "+b);
System.out.println("Sum of digits: " + sum);
}
}
