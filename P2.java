public class P2 {
    static boolean isPalindrome(int num) {
        String s = Integer.toString(num);
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
    public static void main(String[] args) {
        int x = 1221;
        int y = 1234;

        System.out.println(isPalindrome(x));
        System.out.println(isPalindrome(y));
    }
}
