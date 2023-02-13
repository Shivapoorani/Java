import java.util.Scanner;
public class decbin{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.print("Enter a decimal number: ");
int decimal = scan.nextInt();
String binary = Integer.toBinaryString(decimal);
System.out.println("Binary representation: " + binary);
String reverseBinary = new StringBuilder(binary).reverse().toString();
System.out.println("Reverse of binary representation: " + reverseBinary);
}
}
