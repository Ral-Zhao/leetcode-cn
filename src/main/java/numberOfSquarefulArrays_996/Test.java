package numberOfSquarefulArrays_996;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 17, 8};
        Assert.assertEquals(2, solution.numSquarefulPerms(nums));
        nums = new int[]{2, 2, 2};
        Assert.assertEquals(1, solution.numSquarefulPerms(nums));
    }
}
