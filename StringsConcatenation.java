import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringsConcatenation {
    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        List<String> result = subStringConcat(s, words);
        System.out.println(result);

    }

    public static List<String> subStringConcat(String s, String[] words) {
        List<String> result = new ArrayList<>();
        if (s == null || s.length() == 0|| words == null || words.length == 0  ) {
            return result;
        }
        int wordLength = words[0].length();
        int totalWordsLength = wordLength * words.length;
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i <= s.length() - totalWordsLength; i++) {
            Map<String, Integer> currentMap = new HashMap<>(wordFrequency);
            int j = i;
            while (j < i + totalWordsLength) {
                String word = s.substring(j, j + wordLength);
                if (!currentMap.containsKey(word) || currentMap.get(word) == 0){
                    break;
                }
                currentMap.put(word, currentMap.get(word) - 1);
                j += wordLength;
            }
            if(j == i + totalWordsLength){
                result.add(s.substring(i, i+totalWordsLength));
            }

        }
        return result;
    }
}
