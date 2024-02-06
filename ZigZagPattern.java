import java.util.List;

public class ZigZagPattern {


    public static int minOperations(List<Integer> array) {
        int n = array.size();
        if (n <= 2)
            return 0; // No replacements needed for arrays of size <= 2

        int[] dp1 = new int[n]; // dp1[i] stores the min operations to make array zigzag ending at i with low-high-low-high...
        int[] dp2 = new int[n]; // dp2[i] stores the min operations to make array zigzag ending at i with high-low-high-low...

        for (int i = 1; i < n; i++) {
            dp1[i] = dp2[i] = n; // Initialize with n instead of Integer.MAX_VALUE
            for (int j = 0; j < i; j++) {
                if (j % 2 == 0 && array.get(i) < array.get(j)) {
                    // To make it low-high-low-high...
                    dp1[i] = Math.min(dp1[i], dp2[j] + 1);
                } else if (j % 2 == 1 && array.get(i) > array.get(j)) {
                    // To make it high-low-high-low...
                    dp2[i] = Math.min(dp2[i], dp1[j] + 1);
                }
            }
        }

        return Math.min(dp1[n - 1], dp2[n - 1]);
    }

    public static void main(String[] args) {
        // Example usage:
        List<Integer> arr = List.of(2, 1, 2, 3, 4, 5, 2, 91);
        System.out.println(minOperations(arr)); // Output: 2
    }
}


