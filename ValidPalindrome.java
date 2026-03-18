import java.util.Arrays;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        String sl = s.toLowerCase().trim();
        sl = sl.replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right = sl.length() - 1;

        while (left < right) {
            if (sl.charAt(left) != sl.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "race car";
        String t = "Was it a car or a cat I saw?";
        String l = "lebron james";
        
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(t));
        System.out.println(isPalindrome(l));
    }
}
