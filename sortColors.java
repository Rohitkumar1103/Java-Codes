import java.util.Arrays;

public class sortColors {

    public static void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int i = 0;
        
        while (i <= high) {
            if (nums[i] == 0) {
                // Swap nums[i] with nums[low] and move both pointers
                swap(nums, i, low);
                low++;
                i++;
            } else if (nums[i] == 2) {
                // Swap nums[i] with nums[high] and move high pointer
                swap(nums, i, high);
                high--;
            } else {
                // nums[i] == 1, just move i pointer
                i++;
            }
        }
    }
    
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 2, 0, 2};
        System.out.println("Input: " + Arrays.toString(nums));
        sortColors(nums);
        System.out.println("Output: " + Arrays.toString(nums));
    }
}
