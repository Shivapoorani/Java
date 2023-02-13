import java.util.ArrayList;
public class perfectnum{
  public static void main(String[] args) {
    int n = 10; 
    ArrayList<Integer> perfectNumbers = new ArrayList<>();
    int number = 2; 
    while (perfectNumbers.size() < n) {
      if (isPerfect(number)) {
        perfectNumbers.add(number);
      }
      number++;
    }
    System.out.println("The first " + n + " perfect numbers are: " + perfectNumbers);
  }

  private static boolean isPerfect(int number) {
    int sum = 1;
    for (int i = 2; i <= number / 2; i++) {
      if (number % i == 0) {
        sum += i;
      }
    }
    return sum == number;
  }
}
