import java.util.Scanner;
public class bonus{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the salary of the employee: $");
    double salary = scanner.nextDouble();

    System.out.print("Enter the grade of the employee (A or B): ");
    char grade = scanner.next().charAt(0);

    double bonus = 0;
    if (grade == 'A') {
      bonus = salary * 0.05;
    } else if (grade == 'B') {
      bonus = salary * 0.1;
    }

    if (salary < 10000) {
      bonus += salary * 0.02;
    }

    salary += bonus;
    System.out.println("The employee's salary with bonus is $" + salary);
  }
}
