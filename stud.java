import java.util.Scanner;
class student{
int regno;
int m1;
int m2;
int m3;
int m4;
int m5;
double total;
double avg;
student(){
Scanner in = new Scanner(System.in);
System.out.println("Student Name: ");
String name=in.nextLine();
System.out.println("Student RegNo: ");
regno=in.nextInt();
System.out.println("Mark1: ");
m1=in.nextInt();
System.out.println("Mark2: ");
m2=in.nextInt();
System.out.println("Mark3: ");
m3=in.nextInt();
System.out.println("Mark4: ");
m4=in.nextInt();
System.out.println("Mark5: ");
m5=in.nextInt();
}
int m1(){
return m1;
}
int m2(){
return m2;
}
int m3(){
return m3;
}
int m4(){
return m4;
}
int m5(){
return m5;
}
double total(){
return m1+m2+m2+m4+m5;
}
double avg(){
return (m1+m2+m3+m4+m5)/5;
}
}
class stud{
public static void main(String[]args){
student stu1 = new student();
int m1;
m1=stu1.m1();
System.out.println("Mark1: "+m1);
int m2;
m2=stu1.m2();
System.out.println("Mark2: "+m2);
int m3;
m3=stu1.m3();
System.out.println("Mark3: "+m3);
int m4;
m4=stu1.m4();
System.out.println("Mark4: "+m4);
int m5;
m5=stu1.m5();
System.out.println("Mark5: "+m5);
double total;
total = stu1.total();
System.out.println("Total Marks: "+total);
double avg;
avg = stu1.avg();
System.out.println("Average Marks: "+avg);
}
}
