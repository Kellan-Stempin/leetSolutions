import java.util.Arrays;

public class TwoSum2 {
    public static int[] twoSum(int[] nums, int target) {
        int[] comp = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    comp[0] = i;
                    comp[1] = j;
                    return comp;
                }
            }
        }
        return comp;
    }
    public static void main(String[] args) {
        int[] x = {3,4,5,6};
        System.out.println(Arrays.toString(twoSum(x, 7)));
    }
}
