import java.util.ArrayList;
import java.util.List;

public class GreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));

    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(candies.length);
        int maxCandies = 0;
        for (int i : candies) {
            maxCandies = Math.max(maxCandies, i);
        }
        for (int candy : candies) {
            if (maxCandies <= (candy + extraCandies)) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;

    }
}
