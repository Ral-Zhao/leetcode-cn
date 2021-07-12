package bestTimeToBuyAndSellStockIii_123;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = new int[]{3, 3, 5, 0, 0, 3, 1, 4};
        Assert.assertEquals(6, solution.maxProfit(prices));
        prices = new int[]{1, 2, 3, 4, 5};
        Assert.assertEquals(4, solution.maxProfit(prices));
        prices = new int[]{7, 6, 4, 3, 1};
        Assert.assertEquals(0, solution.maxProfit(prices));

        prices = new int[]{3, 3, 5, 0, 0, 3, 1, 4};
        Assert.assertEquals(6, solution.maxProfit_2(prices));
        prices = new int[]{1, 2, 3, 4, 5};
        Assert.assertEquals(4, solution.maxProfit_2(prices));
        prices = new int[]{7, 6, 4, 3, 1};
        Assert.assertEquals(0, solution.maxProfit_2(prices));
    }
}
