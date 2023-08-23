import java.util.Scanner;
class acc{
Scanner sc = new Scanner(System.in);
void display(){
System.out.println("Depositer Name: ");
String n = sc.nextLine();
System.out.println("Type of Account: ");
String typeacc = sc.nextLine();
System.out.println("Account Number: ");
int accnum = sc.nextInt();
}
void display1(){
int minbal = 5000;
System.out.println("Deposited Amount: ");
int depam = sc.nextInt();
int total = minbal+depam;
System.out.println("Total Balance in Account: "+total);
}
}
class bankbal{
public static void main(String args[]){
acc a = new acc();
a.display();
a.display1();
}
}