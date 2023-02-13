import java.util.Scanner;
public class invertpyr{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.print("Enter the height of the pyramid: ");
int height = scan.nextInt();
for (int i = height; i >= 1; i--){
for (int j = 1; j <= height - i; j++){
System.out.print(" ");
}
for (int j = 1; j <= 2 * i - 1; j++){
System.out.print("*");
}
System.out.println();
}
}
}
