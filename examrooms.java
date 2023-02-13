import java.util.Scanner;
import java.util.TreeSet;
class ExamRoom {
private int n;
private TreeSet<Integer> students;
public ExamRoom(int n) {
this.n = n;
this.students = new TreeSet<>();
}
public int seat() {
if (students.isEmpty()) {
students.add(0);
return 0;
}
int seat = 0;
int maxDist = students.first();
int left = 0, right = 0;
for (int student : students) {
right = student;
int dist = (right - left) / 2;
if (dist > maxDist) {
maxDist = dist;
seat = left + dist;
}
left = student;
}
if (n - 1 - students.last() > maxDist) {
seat = n - 1;
}
students.add(seat);
return seat;
}
public void leave(int p) {
students.remove(p);
}
}
public class examrooms{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.print("Enter the number of seats in the exam room: ");
int n = scan.nextInt();
ExamRoom examRoom = new ExamRoom(n);
while (true) {
System.out.println("Enter 1 to seat a student, 2 to leave a seat, or 0 to exit: ");
int choice = scan.nextInt();
if (choice == 1) {
System.out.println("The next student will sit on seat " + examRoom.seat());
} 
else if (choice == 2) {
System.out.print("Enter the seat number to leave: ");
int p = scan.nextInt();
examRoom.leave(p);
} 
else if (choice == 0) {
break;
}
}
scan.close();
}
}
