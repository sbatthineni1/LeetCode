import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0},nums2 = {2,5,6};
        int m = 3, n = 3;
        merge(nums1, m, nums2,n);

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Index = m-1;
        int nums2Index = n-1;
        int mergedArrayIndex = m+n-1;
        while(nums1Index >= 0 && nums2Index >=0){
            if(nums1[nums1Index] > nums2[nums2Index]){
                nums1[mergedArrayIndex--] = nums1[nums1Index--];
            }
            else{
                nums1[mergedArrayIndex--] = nums2[nums2Index--];
            }
        }
        while(nums2Index >= 0){
            nums1[mergedArrayIndex--] = nums2[nums2Index--];

        }
        System.out.println(Arrays.toString(nums1));
    }

}
