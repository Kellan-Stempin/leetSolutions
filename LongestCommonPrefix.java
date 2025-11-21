public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        for (String s : strs) {
            if (s.length() == 0) {
                return "";
            }
        }

        char target = strs[0].charAt(0);
        for (String s : strs) {
            if (s.charAt(0) != target) {
                return "";
            }
        }

        String[] shorter = new String[strs.length];
        for (int i = 0; i < strs.length; i++) {
            shorter[i] = strs[i].substring(1);
        }

        return target + longestCommonPrefix(shorter);
    }
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flop"};
        System.out.println();
        System.out.println(longestCommonPrefix(strs));
    }
}