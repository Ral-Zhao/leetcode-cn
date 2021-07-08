package coinChange2_518;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] coins = new int[]{1, 2, 5};
        Assert.assertEquals(4, solution.change(5, coins));
        coins = new int[]{2};
        Assert.assertEquals(0, solution.change(3, coins));
        coins = new int[]{10};
        Assert.assertEquals(1, solution.change(10, coins));
        coins = new int[]{7};
        Assert.assertEquals(1, solution.change(0, coins));
    }
}
