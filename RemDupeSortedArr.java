import java.util.ArrayList;


public class RemDupeSortedArr {
    public static int removeDuplicates(int[] nums) {
        ArrayList<Integer> s = new ArrayList<Integer>();
        for (int n : nums) {
            s.add(n);
        }
        return s.size();
    }

    public static void main(String[] args) {
        int[] ex1 = {1,1,2};
        int[] ex2 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(ex1));
        System.out.println(removeDuplicates(ex2));

    }
}
