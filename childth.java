import java.util.Scanner;
class MyThread extends Thread {
MyThread(){
super();
}
public void run() {
System.out.println("Child thread started executing.");
}
}
public class childth{
public static void main(String[] args) {
System.out.println("Main thread started executing.");
MyThread t = new MyThread();
t.start();
Scanner input = new Scanner(System.in);
System.out.print("Enter a string: ");
String str = input.nextLine();
System.out.println("You entered: " + str);
System.out.println("Main thread finished executing.");
}
}
