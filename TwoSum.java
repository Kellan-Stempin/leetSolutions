import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] sols = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            for (int r = i + 1; r < nums.length; r++) {
                if (nums[r] == num) {
                    sols[0] = i;
                    sols[1] = r; 
                }

            }
        }
        return sols; 
    }
    public static void main(String[] args) {
        int[] x = {3, 2, 6, 8};
        System.out.println(Arrays.toString(twoSum(x , 10)));
    }
}
