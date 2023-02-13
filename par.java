class ParentClass {
void displayMessage() {
System.out.println("This is parent class");
}
}
class ChildClass extends ParentClass {
void displayMessage() {
System.out.println("This is child class");
}
}
public class par{
public static void main(String[] args) {
ParentClass parent = new ParentClass();
ChildClass child = new ChildClass();
parent.displayMessage();
child.displayMessage();
((ParentClass) child).displayMessage();
}
}
