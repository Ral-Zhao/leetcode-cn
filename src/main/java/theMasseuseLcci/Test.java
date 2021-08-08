package theMasseuseLcci;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 1};
        Assert.assertEquals(4, solution.massage(nums));
        nums = new int[]{2, 7, 9, 3, 1};
        Assert.assertEquals(12, solution.massage(nums));
        nums = new int[]{2, 1, 4, 5, 3, 1, 1, 3};
        Assert.assertEquals(12, solution.massage(nums));
    }
}
