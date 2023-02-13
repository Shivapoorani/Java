import java.util.HashMap;
public class wchashmap{
public static void main(String[] args) {
String str = "this is a test string";
String[] words = str.split(" ");
HashMap<String, Integer> wordCount = new HashMap<>();
for (String word : words) {
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