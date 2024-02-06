import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxTilesCovered {
    public static void main(String[] args) {
        int[][] tiles = {{1, 5}, {10, 11}, {12, 18}, {20, 25}, {30, 32}};
        int carpetLen = 10;
        System.out.println(maximumWhiteTiles(tiles, carpetLen));

    }

    public static int maximumWhiteTiles(int[][] tiles, int carpetLen) {
        int maxWhiteTiles = 0;
        tiles = merge(tiles);

        for (int[] tile : tiles) {
            int start = tile[0];
            int end = tile[1];

            int carpetStart = start - carpetLen + 1;
            int carpetEnd = end;

            carpetStart = Math.max(carpetStart, start);
            carpetEnd = Math.min(carpetEnd, end + carpetLen - 1);

            int whileTilesCovered = carpetEnd - carpetStart + 1;
            maxWhiteTiles = Math.max(maxWhiteTiles, whileTilesCovered);
        }
        return maxWhiteTiles;

    }
    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals;

        // Sort by interval start
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();
        int[] currInterval = intervals[0];

        for (int[] interval : intervals) {
            if (interval[0] <= currInterval[1]+1) {
                // Merge overlapping intervals
                currInterval[1] = Math.max(currInterval[1], interval[1]);
            } else {
                // No overlap, add current interval to result
                result.add(currInterval);
                currInterval = interval;
            }
        }

        // Add last interval
        result.add(currInterval);

        return result.toArray(new int[result.size()][]);
    }
}
