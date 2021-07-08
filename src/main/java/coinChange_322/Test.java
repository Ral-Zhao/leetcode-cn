package coinChange_322;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] coins = new int[]{1, 2, 5};
        Assert.assertEquals(3, solution.coinChange(coins, 11));
        coins = new int[]{2};
        Assert.assertEquals(-1, solution.coinChange(coins, 3));
        coins = new int[]{1};
        Assert.assertEquals(0, solution.coinChange(coins, 0));
        coins = new int[]{1};
        Assert.assertEquals(1, solution.coinChange(coins, 1));
        coins = new int[]{1};
        Assert.assertEquals(2, solution.coinChange(coins, 2));
    }
}
