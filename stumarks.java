import java.util.Scanner;
public class stumarks{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter marks for subject 1: ");
    int marks1 = input.nextInt();
    
    System.out.print("Enter marks for subject 2: ");
    int marks2 = input.nextInt();
    
    System.out.print("Enter marks for subject 3: ");
    int marks3 = input.nextInt();
    
    System.out.print("Enter marks for subject 4: ");
    int marks4 = input.nextInt();
    
    int total = marks1 + marks2 + marks3 + marks4;
    float aggregate = total / 4.0f;
    
    System.out.println("Total marks: " + total);
    System.out.println("Aggregate marks: " + aggregate);
    
    if (aggregate >= 75) {
      System.out.println("Grade: Distinction");
    } else if (aggregate >= 60 && aggregate < 75) {
      System.out.println("Grade: First Division");
    } else if (aggregate >= 50 && aggregate < 60) {
      System.out.println("Grade: Second Division");
    } else if (aggregate >= 40 && aggregate < 50) {
      System.out.println("Grade: Third Division");
    } else {
      System.out.println("Grade: Fail");
    }
  }
}
