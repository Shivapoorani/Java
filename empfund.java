import java.util.Scanner;
public class empfund{
public static void main(String[] args) {
double amount, interest;
int years;
Scanner sc = new Scanner(System.in);
try {
System.out.print("Enter the amount: ");
amount = sc.nextDouble();
System.out.print("Enter the number of years: ");
years = sc.nextInt();
interest = (amount * years * 8) / 100;
System.out.println("Rate of interest: " + interest);
} 
catch (Exception e) {
System.out.println("Invalid Input.");
} 
finally {
System.out.println("Finally Blocked.");
sc.close();
}
}
}
