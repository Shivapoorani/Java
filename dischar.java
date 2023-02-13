import java.util.HashMap;
public class dischar {
  public static void main(String[] args) {
    String str = "abcb";
    HashMap<Character, Integer> charCount = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (charCount.containsKey(c)) {
        charCount.put(c, charCount.get(c) + 1);
      } else {
        charCount.put(c, 1);
      }
    }
    System.out.println("Distinct characters and their count in the given string: " + charCount);
  }
}