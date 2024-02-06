import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class sortColorsNums {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);


    }
    public static void sortColors(int[] nums) {
        int n = nums.length -1;
        Map<Integer, Integer> result = new HashMap<>();
        for(int num : nums){
            result.put(num, result.getOrDefault(num, 0)+1);

        }
        int index = 0;
        for(int color = 0; color <= 2; color++){
            if(result.containsKey(color)) {
                int count = result.get(color);

                for (int i = 0; i < count; i++) {
                    nums[index++] = color;
                }
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}
