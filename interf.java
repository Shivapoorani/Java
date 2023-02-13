interface IterF1 {
void add();
void sub();
}
class Operations implements IterF1 {
int num1, num2;
Operations(int num1, int num2) {
this.num1 = num1;
this.num2 = num2;
}
public void add() {
System.out.println("Addition of two numbers: " + (num1 + num2));
}
public void sub() {
System.out.println("Subtraction of two numbers: " + (num1 - num2));
}
public void add(int num1, int num2) {
System.out.println("Addition of two numbers: " + (num1 + num2));
}
public void sub(int num1, int num2) {
System.out.println("Subtraction of two numbers: " + (num1 - num2));
}
}
public class interf{
public static void main(String[] args) {
Operations op = new Operations(10, 5);
op.add();
op.sub();
op.add(20, 30);
op.sub(40, 20);
}
}
