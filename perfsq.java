import java.util.Scanner;
public class perfsq{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Lower Number: ");
int lower = sc.nextInt();
System.out.println("Enter the Upper Number: ");
int upper = sc.nextInt();
System.out.println("The Perfect Squares Between " + lower + " and " + upper + "  are: ");
for (int i = lower; i <= upper; i++) {
int sqrt = (int) Math.sqrt(i);
if (sqrt * sqrt == i) {
int sum = 0;
int num = i;
while (num != 0) {
sum += num % 10;
num /= 10;
}
if (sum < 100) {
System.out.print(i + " ");
}
}
}
}
}
