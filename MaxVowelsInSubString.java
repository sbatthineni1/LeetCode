import java.util.Arrays;
import java.util.HashSet;

public class MaxVowelsInSubString {
    public static void main(String[] args) {
        String s = "aeiou";
        int k = 2;
        System.out.println(maxVowels(s, k));

    }

    public static int maxVowels(String s, int k) {
        int maxVowels = 0;
        int vowels = 0;
        HashSet<Character> vowelSet = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        for (int i = 0; i < s.length(); i++) {
            // Count vowels in current window
            if (vowelSet.contains(s.charAt(i))) {
                vowels++;
            }

            // Remove leftmost char from window
            if (i >= k && vowelSet.contains(s.charAt(i - k))) {
                vowels--;
            }

            // Update max vowels
            maxVowels = Math.max(maxVowels, vowels);
        }

        return maxVowels;
    }
}
