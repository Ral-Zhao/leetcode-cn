package jumpGameIi_45;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{2, 3, 1, 1, 4};
        Assert.assertEquals(2, solution.jump(nums));
        Assert.assertEquals(2, solution.jump_2(nums));
        nums = new int[]{2, 3, 0, 1, 4};
        Assert.assertEquals(2, solution.jump(nums));
        Assert.assertEquals(2, solution.jump_2(nums));
        nums = new int[]{1,2};
        Assert.assertEquals(1, solution.jump(nums));
        Assert.assertEquals(1, solution.jump_2(nums));
        nums = new int[]{0};
        Assert.assertEquals(0, solution.jump(nums));
        Assert.assertEquals(0, solution.jump_2(nums));
    }
}
