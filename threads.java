class MyThread extends Thread {
public void run() {
for (int i = 0; i < 10; i++) {
System.out.println(Thread.currentThread().getName() + ": " + i);
}
}
}
public class threads{
public static void main(String[] args) throws InterruptedException {
MyThread t1 = new MyThread();
MyThread t2 = new MyThread();
MyThread t3 = new MyThread();
t1.start();
t2.start();
t3.start();
Thread.sleep(500);
t1.join();
t2.join();
t3.join();
System.out.println("All threads have finished.");
}
}