import java.util.HashMap;
import java.util.Map;

public class ElementFrequency {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(maxFrequencyElements(nums));

    }
    public static int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> numFrequency = new HashMap<>();
        for(int num: nums){
            numFrequency.put(num, numFrequency.getOrDefault(num, 0)+1);
        }
        int max = 0;
        for(int num: nums){
            max = Math.max(max,  numFrequency.get(num));
        }
        int count = 0;
        for(int num: nums){
            if(max == numFrequency.get(num)){
                count++;
            }
        }
        return count;


    }
}
