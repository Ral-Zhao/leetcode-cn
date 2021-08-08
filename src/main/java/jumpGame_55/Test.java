package jumpGame_55;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{2, 3, 1, 1, 4};
        Assert.assertTrue(solution.canJump(nums));
        Assert.assertTrue(solution.canJump_2(nums));
        nums = new int[]{3,2,1,0,4};
        Assert.assertTrue(!solution.canJump(nums));
        Assert.assertTrue(!solution.canJump_2(nums));
    }
}
