package problems.leetcode.grind75.array;

public class BestTimeToBuyAndSellStocks {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;
        int low = prices[0];
        int max = 0;

        for (int price : prices) {
            if (price < low) {
                low = price;
                continue;
            }
            max = Math.max(price - low, max);
        }

        return max;
    }
}
