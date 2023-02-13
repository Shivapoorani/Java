class SingleObject {
private static SingleObject instance = null;
private SingleObject() {
if (instance != null) {
throw new RuntimeException("Cannot create multiple instances of SingleObject.");
}
}
public static SingleObject getInstance() {
if (instance == null) {
instance = new SingleObject();
}
return instance;
}
}
public class createobj{
public static void main(String[] args) {
try{
SingleObject object1 = SingleObject.getInstance();
System.out.println("First object created successfully.");
SingleObject object2 = SingleObject.getInstance();
System.out.println("Second object created successfully.");
} 
catch (RuntimeException e) {
System.out.println("Exception caught: " + e.getMessage());
}
}
}
