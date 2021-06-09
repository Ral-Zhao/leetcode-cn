package minCostClimbingStairs_746;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] cost = new int[]{10, 15};
        Assert.assertEquals(10, solution.minCostClimbingStairs(cost));
        cost = new int[]{10, 15, 20};
        Assert.assertEquals(15, solution.minCostClimbingStairs(cost));
        cost = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        Assert.assertEquals(6, solution.minCostClimbingStairs(cost));
    }
}
