import java.util.Scanner;
class vowel
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:");
int vcount=0;
String a=sc.nextLine();
a=a.toLowerCase();
for(int i=0;i<a.length();i++)
{
char x=a.charAt(i);
if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
{
vcount++;
}
}
System.out.println("no of vowels in the string:"+vcount);
}
}