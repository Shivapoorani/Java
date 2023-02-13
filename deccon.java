import java.util.Scanner;
public class deccon {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a decimal number: ");
      int decimal = sc.nextInt();
      sc.close();
      int[] binary = new int[100];
      int index = 0;
      while(decimal > 0) {
         binary[index++] = decimal % 2;
         decimal = decimal / 2;
      }
      System.out.print("Binary equivalent: ");
      for(int i = index - 1; i >= 0; i--) {
         System.out.print(binary[i]);
      }
      System.out.println();
      int[] octal = new int[100];
      index = 0;
      while(decimal > 0) {
         octal[index++] = decimal % 8;
         decimal = decimal / 8;
      }
      System.out.print("Octal equivalent: ");
      for(int i = index - 1; i >= 0; i--) {
         System.out.print(octal[i]);
      }
      System.out.println();
   }
}
