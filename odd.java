import java.util.Scanner;
class odd{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter value of n: ");
int n = input.nextInt();
int count = 0;
int i = 1;
System.out.print("Hence the values printed for i are ");
while (count < n){
if (i % 2 != 0){
System.out.print(i + " ");
count++;
}
i++;
}
}
}
