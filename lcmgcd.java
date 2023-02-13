import java.util.Scanner;
public class lcmgcd{
public static int gcd(int a, int b){
if (b == 0) return a;
return gcd(b, a % b);
}
public static int lcm(int a, int b){
return a * (b / gcd(a, b));
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("N Value : ");
int n = sc.nextInt();
int[] arr = new int[n];
System.out.print("Enter the " + n + " integers: ");
for (int i = 0; i < n; i++){
arr[i] = sc.nextInt();
}
int lcm = arr[0];
for (int i = 1; i < n; i++){
lcm = lcm(lcm, arr[i]);
}
int gcd = arr[0];
for (int i = 1; i < n; i++){
gcd = gcd(gcd, arr[i]);
}
System.out.println("LCM of the given numbers is: " + lcm);
System.out.println("GCD of the given numbers is: " + gcd);
}
}
