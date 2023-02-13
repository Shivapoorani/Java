import java.util.Scanner;
public class compab{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter the value of a: ");
int a = input.nextInt();
System.out.print("Enter the value of b: ");
int b = input.nextInt();
System.out.println("Composite numbers between " + a + " and " + b + " are:");
for (int i = a; i <= b; i++) {if (isComposite(i)) {
System.out.print(i + " ");
}
}
}
public static boolean isComposite(int n){
if (n <= 1){
return false;
}
for (int i = 2; i <= Math.sqrt(n); i++){
if (n % i == 0) {
return true;
}
}
return false;
}
}
