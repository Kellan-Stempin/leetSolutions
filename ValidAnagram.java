import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        char[] sl = s.toCharArray();
        char[] tl = t.toCharArray();

        Arrays.sort(sl);
        Arrays.sort(tl);

        if (Arrays.equals(sl, tl)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "jar";
        String t = "jam";

        System.out.println(isAnagram(s, t));
    }
}
