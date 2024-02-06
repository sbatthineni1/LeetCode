//import jdk.jfr.Frequency;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class DegreeOfArray {
//    public static void main(String[] args) {
//        int[] nums = {1,2,2,3,1};
//        System.out.println(findShortestSubArray(nums));
//
//    }
//    public static int findShortestSubArray(int[] nums) {
//        int frequency = 0;
//        Map<Integer, Integer> numFrequency = new HashMap<>();
//        for(int num: nums){
//            numFrequency.put(num, numFrequency.getOrDefault(num, 0)+1);
//            frequency = Math.max(frequency, numFrequency.get(num));
//        }
//
//
//
//
//    }
//}
