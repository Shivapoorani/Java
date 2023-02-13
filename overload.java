public class overload {
public void assignValues(int a, int b) {
System.out.println("Values assigned using two arguments: " + a + ", " + b);
}
public void assignValues(int a, int b, int c) {
System.out.println("Values assigned using three arguments: " + a + ", " + b + ", " + c);
}
public static void main(String[] args) {
overload overload = new overload();
overload.assignValues(1, 2);
overload.assignValues(1, 2, 3);
}
}