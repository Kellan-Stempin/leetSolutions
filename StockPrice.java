public class StockPrice {
    public static int maxProfit(int[] prices) {
        int maxProf = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int temp = prices[j] - prices[i];
                if (temp > maxProf) {
                    maxProf = temp;
                }
            }
        }
        return maxProf;
    }

    public static void main(String[] args) {
        int[] p = {10,1,5,6,7,1};
        int[] x = {10,8,7,5,2};

        System.out.println(maxProfit(p));
        System.out.println(maxProfit(x));
    }
}
