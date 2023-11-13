package problems.leetcode.grind75.dynamicprogramming;

public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        int[] minimumCoins = new int[amount + 1];

        for (int i = 1; i < amount + 1; i++) {
            for (int coin : coins) {
                int xd = i - coin;
                if (xd < 0) continue;
                if (xd == 0) minimumCoins[i] = 1;
                else if (minimumCoins[xd] != 0) {
                    if (minimumCoins[i] == 0) {
                        minimumCoins[i] = minimumCoins[xd] + 1;
                    }
                    else {
                        minimumCoins[i] = Math.min(minimumCoins[xd] + 1, minimumCoins[i]);
                    }
                }
            }
        }

        return minimumCoins[amount] == 0 ? -1 : minimumCoins[amount];
    }
}
