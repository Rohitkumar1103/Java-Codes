
import java.util.*;

public class monotonic {

    public static boolean isMonotonic(ArrayList<Integer> nums) {
        boolean inc = true;
        boolean dec = true;

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                inc = false;
            }
            if (nums.get(i) < nums.get(i + 1)) {
                dec = false;
            }
        }
        return inc || dec;
    }

    public static void main(String[] args) {

        ArrayList<Integer> nums1 = new ArrayList<>(List.of(1, 2, 2, 3));
        System.out.println(isMonotonic(nums1)); // Output: true

        ArrayList<Integer> nums2 = new ArrayList<>(List.of(6, 5, 4, 4));
        System.out.println(isMonotonic(nums2)); // Output: true

        ArrayList<Integer> nums3 = new ArrayList<>(List.of(1, 3, 2));
        System.out.println(isMonotonic(nums3)); // Output: false
    }
}
