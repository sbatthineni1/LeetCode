import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int [] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));

    }
    public static int[] sortedSquares(int[] nums) {
        int[] result = new int [nums.length];
        for(int i = 0; i < nums.length; i++){
            result[i] = square(nums[i]);
        }
        Arrays.sort(result);

        return result;


    }
    public static int square(int num){
        return num * num;

    }

}
