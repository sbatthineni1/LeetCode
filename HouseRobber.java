public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(rob(nums));

    }

    public static int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

//        int[] dp = new int[nums.length];
//        dp[0] = nums[0];
//        dp[1] = Math.max(nums[0], nums[2]);
//        for (int i = 2; i < nums.length; i++) {
//            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
//
//        }
//        return dp[nums.length - 1];
        return robhelper(nums, 0, nums.length-1);


    }

    public static int robhelper(int[] nums, int start, int end) {
        int prevMax = 0;
        int currMax = 0;

        for (int i = start; i <= end; i++) {
            int temp = currMax;
            currMax = Math.max(currMax, prevMax + nums[i]);
            prevMax = temp;

        }
        return currMax;
    }
}
