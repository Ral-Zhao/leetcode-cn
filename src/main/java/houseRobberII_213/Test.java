package houseRobberII_213;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{2, 3, 2};
        Assert.assertEquals(3, solution.rob(nums));
        nums = new int[]{1, 2, 3, 1};
        Assert.assertEquals(4, solution.rob(nums));
        nums = new int[]{1, 2};
        Assert.assertEquals(2, solution.rob(nums));
    }
}
