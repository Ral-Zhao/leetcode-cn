package climbingStairs_70;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.climbStairs(3));
        Assert.assertEquals(2, solution.climbStairs(2));
    }
}
