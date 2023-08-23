import java.util.Scanner;
class mmm{
public static void main(String args[]){
int i;
float total = 0;
int x[]=new int[15];
Scanner sc = new Scanner(System.in);
System.out.println("Range of Numbers to be Printed: ");
int n = sc.nextInt();
System.out.println("Number: ");
for( i=1;i<=n;i++){
x[i]=sc.nextInt();
total = total+x[i];
}
float mean = total/n;
System.out.println("Mean: "+mean);

]
}
}
