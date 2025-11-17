
public class ValidParentheses {
    public static boolean isValid(String s) {

        if (s.length() == 0) {
            return true;
        }

        if (s.length() % 2 != 0) return false;

        for (int i = 0; i < s.length() - 1; i++) {
            char target = 't';
            if (s.charAt(i) == '(') target = ')';
            else if (s.charAt(i) == '[') target = ']';
            else if (s.charAt(i) == '{') target = '}';

            if (s.charAt(i + 1) == target) {
                String temp = s.substring(0, i) + s.substring(i + 2, s.length());
                return isValid(temp);
            }

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isValid("({)[}]"));
        System.out.println(isValid("({)[}]("));
        System.out.println(isValid("({)[}](({}"));
        System.out.println(isValid(")(]]{}"));
        System.out.println(isValid("()"));
        System.out.println(isValid("([])"));
    }
}