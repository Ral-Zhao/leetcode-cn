package bestTimeToBuyAndSellStockWithCooldown_309;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = new int[]{1, 2, 3, 0, 2};
        Assert.assertEquals(3, solution.maxProfit(prices));
    }
}
