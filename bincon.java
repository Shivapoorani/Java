import java.util.Scanner;
public class bincon{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a binary number: ");
int binary = sc.nextInt();
int decimal = 0;
int octal = 0;
int i = 0;
while (binary != 0) {
decimal += ((binary % 10) * Math.pow(2, i));
binary = binary / 10;
i++;
}
i = 1;
int j = decimal;
while (j != 0) {
octal += (j % 8) * i;
j = j / 8;
i = i * 10;
}
System.out.println("Decimal representation: " + decimal);
System.out.println("Octal representation: " + octal);
}
}
