
public class waterTrap {

    public int trap(int height[]) {
        int left = 0, right = height.length - 1;
        int waterTrapped = 0;

        int rMax = height[right], lMax = height[left];
        while (left < right) {
            if (lMax < rMax) {
                left++;
                lMax = Math.max(lMax, height[left]);
                waterTrapped += lMax - height[left];
            } else {
                right--;
                rMax = Math.max(rMax, height[right]);
                waterTrapped += rMax - height[right];
            }
        }

        return waterTrapped;
    }

    public static void main(String[] args) {
        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        waterTrap wt = new waterTrap();

        System.out.println(wt.trap(height));
    }
}
