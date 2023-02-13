import java.util.HashMap;
import java.util.StringTokenizer;
public class sorthash{
public static void main(String[] args) {
String str = "This is a test string for counting the number of words";
HashMap<String, Integer> wordCount = new HashMap<>();
StringTokenizer tokenizer = new StringTokenizer(str);
while (tokenizer.hasMoreTokens()) {
String word = tokenizer.nextToken();
if (wordCount.containsKey(word)) {
wordCount.put(word, wordCount.get(word) + 1);
} 
else {
wordCount.put(word, 1);
}
}
System.out.println("Word count in the given string: " + wordCount);
}
}