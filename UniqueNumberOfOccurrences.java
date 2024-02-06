import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 4, 1, 3};
        System.out.println(uniqueOccurrences(arr));

    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> noOfOccurrence = new HashMap<>();
        for (int num : arr) {
            noOfOccurrence.put(num, noOfOccurrence.getOrDefault(num, 0) + 1);

        }
        Set<Integer> uniqueCounts = new HashSet<>(noOfOccurrence.values());
        return noOfOccurrence.size() == uniqueCounts.size();
    }
}
