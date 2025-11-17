import java.util.Arrays;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        System.out.println(Arrays.toString(str));
        int l = str.length - 1;

        return str[l].length();
    }
    
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World       "));
    }
}
