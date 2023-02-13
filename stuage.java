import java.util.Scanner;
class AgeNotWithinRangeException extends Exception {
public AgeNotWithinRangeException(String message) {
super(message);
}
}
class NameNotValidException extends Exception {
public NameNotValidException(String message) {
super(message);
}
}
class Student {
private int rollNo;
private String name;
private int age;
private String course;
public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
this.rollNo = rollNo;
if (!name.matches("^[a-zA-Z ]*$")) {throw new NameNotValidException("Name contains numbers or special symbols.");
}
this.name = name;
if (age < 15 || age > 21) {
throw new AgeNotWithinRangeException("Age is not within range 15-21.");
}
this.age = age;
this.course = course;
}
public int getRollNo() {
return rollNo;
}
public String getName() {
return name;
}
public int getAge() {
return age;
}
public String getCourse() {
return course;
}
public String toString() {
return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", course=" + course + "]";
}
}
public class stuage{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter Roll No: ");
int rollNo = scanner.nextInt();
System.out.print("Enter Name: ");
String name = scanner.next();
System.out.print("Enter Age: ");
int age = scanner.nextInt();
System.out.print("Enter Course: ");
String course = scanner.next();
try {
Student student = new Student(rollNo, name, age, course);
System.out.println("Student Details: " + student);
} 
catch (AgeNotWithinRangeException | NameNotValidException e) {
System.out.println("Error: " + e.getMessage());
}
scanner.close();
}
}
