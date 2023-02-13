import java.util.Scanner;
class hollowsqdollar{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
System.out.println("Enter the Size: ");
int size=in.nextInt();
for (int row = 1; row <= size; row++){
for (int col = 1; col <= size; col++){
if (row == 1 || row == size || col == 1 || col == size){
System.out.print("$");
} 
else{
System.out.print(" ");
}
}
System.out.println();
}
}
}
