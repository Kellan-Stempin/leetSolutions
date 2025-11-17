import java.util.HashMap;

public class App {
    public static int romanToInt(String s) {
        int total = 0;
        HashMap<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        for (int i = 0; i < s.length() - 1; i++) {
            int x = values.get(s.charAt(i));
            int y = values.get(s.charAt(i + 1));
            if (x < y) {
                total -= x;
            } else {
                total += x;
            }
        }
        total += values.get(s.charAt(s.length() - 1));


        return total;

    }
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}