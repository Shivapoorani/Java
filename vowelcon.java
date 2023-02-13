import java.util.Scanner;
class vowelcon
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int vcount=0;
System.out.println("Enter the string:");
String str=s.nextLine();
str=str.toLowerCase();
System.out.print("vowels:");
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
{
char v=str.charAt(i);
System.out.print(v);
}
}
System.out.println("\nconsonants:");
for(int i=0;i<str.length();i++)
{
if(str.charAt(i) !='a' ||str.charAt(i)!='e'||str.charAt(i)!='i'||str.charAt(i)!='o'||str.charAt(i)!='u')
{
char c=str.charAt(i);
System.out.print(c);
}
}
}
}