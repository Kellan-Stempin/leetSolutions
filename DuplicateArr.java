public class DuplicateArr {
    public static boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] x = {1,2,3,3};
        int[] y = {1,2,3,4};

        System.out.println(hasDuplicate(x));
        System.out.println(hasDuplicate(y));
    }
}
