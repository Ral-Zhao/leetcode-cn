package bestTimeToBuyAndSellStockWithTransactionFee_714;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = new int[]{1, 3, 2, 8, 4, 9};
        Assert.assertEquals(8, solution.maxProfit(prices, 2));
        prices = new int[]{1, 3, 7, 5, 10, 3};
        Assert.assertEquals(6, solution.maxProfit(prices, 3));
    }
}
