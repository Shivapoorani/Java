import java.util.Scanner;
class userdetail{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Number of Students: ");
int suser = sc.nextInt();
System.out.println("Number of Staffs: ");
int stuser = sc.nextInt();
int nuser = (stuser/3);
System.out.println("Total No of Users in the College: "+(suser+stuser+nuser));
System.out.println("Total No of Student Users in the College: "+suser);
System.out.println("Total No of Staff Users in the College: "+stuser);
System.out.println("Total No of Non Teaching Staffs Users in the College: "+nuser);
}
}
