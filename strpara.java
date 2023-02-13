import java.util.HashMap;
import java.util.Map;
class strpara{
  public static void main(String[] args) {
    String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
    String[] banned = {"hit"};
    System.out.println(mostCommonWord(paragraph, banned));
  }

  public static String mostCommonWord(String paragraph, String[] banned) {
    paragraph = paragraph.toLowerCase();
    String[] words = paragraph.split("[ !?',;.]+");

    Map<String, Integer> frequencyMap = new HashMap<>();
    for (String word : words) {
      if (!bannedContains(banned, word)) {
        frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
      }
    }

    String mostFrequentWord = "";
    int maxFrequency = 0;
    for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
      if (entry.getValue() > maxFrequency) {
        maxFrequency = entry.getValue();
        mostFrequentWord = entry.getKey();
      }
    }

    return mostFrequentWord;
  }

  private static boolean bannedContains(String[] banned, String word) {
    for (String bannedWord : banned) {
      if (bannedWord.equals(word)) {
        return true;
      }
    }
    return false;
  }
}