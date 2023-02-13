import java.util.Scanner;
public class factor{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = input.nextInt();
int count = 0;
for (int i = 1; i <= num; i++) {
if (num % i == 0) {
count++;
}
}
System.out.println("Number of factors: " + count);
}
}
