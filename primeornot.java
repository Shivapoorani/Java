import java.util.Scanner;
class PrimeChecker implements Runnable{
private int number;
PrimeChecker(int number){
this.number = number;
}
public void run(){
boolean isPrime = true;
for (int i = 2; i <= number / 2; i++){
if (number % i == 0) {
isPrime = false;
break;
}
}
if (isPrime){
System.out.println(number + " is a prime number");
} 
else{
System.out.println(number + " is not a prime number");
}
}
}
publ
ic class primeornot{public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number: ");
int num=sc.nextInt();
PrimeChecker primeChecker = new PrimeChecker(num);
Thread thread = new Thread(primeChecker);
thread.start();
}
}
