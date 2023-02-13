public class artexp{
public static void main(String[] args) {
try {
int a = 5;
int b = 0;
int c = a / b; 
int[] array = {1, 2, 3};
System.out.println(array[3]); 
String str = null;
System.out.println(str.length()); 
} 
catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException ex) {
System.out.println("An exception occurred: " + ex);
}
}
}
