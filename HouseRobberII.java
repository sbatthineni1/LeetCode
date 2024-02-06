public class HouseRobberII {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(rob(nums));

    }

    public static int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int max1 = robhelper(nums, 0, nums.length - 2);
        int max2 = robhelper(nums, 1, nums.length - 1);
        return Math.max(max1, max2);

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
