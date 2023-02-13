class NaturalNumbersThread implements Runnable {
private int max;
public NaturalNumbersThread(int max) {
this.max = max;
}
public void run() {
try {
for (int i = 1; i <= max; i++) {
System.out.println(Thread.currentThread().getName() + ": " + i);
Thread.sleep(1000);
}
} 
catch (InterruptedException e) {
System.out.println(Thread.currentThread().getName() + " interrupted.");
}
}
}
public class naturalthread{
public static void main(String[] args) {
Thread t1 = new Thread(new NaturalNumbersThread(10), "Thread 1");
Thread t2 = new Thread(new NaturalNumbersThread(20), "Thread 2");
Thread t3 = new Thread(new NaturalNumbersThread(30), "Thread 3");
t1.start();
t2.start();
t3.start();
}
}
