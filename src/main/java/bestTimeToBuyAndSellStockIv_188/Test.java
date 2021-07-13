package bestTimeToBuyAndSellStockIv_188;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = new int[]{2, 4, 1};
        Assert.assertEquals(2, solution.maxProfit(2, prices));
        prices = new int[]{3, 2, 6, 5, 0, 3};
        Assert.assertEquals(7, solution.maxProfit(2, prices));
        prices = new int[]{};
        Assert.assertEquals(0, solution.maxProfit(2, prices));
    }
}
