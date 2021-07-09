package combinationSumIv_377;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 2, 3};
        Assert.assertEquals(7, solution.combinationSum4(nums, 4));
        nums = new int[]{ 2, 1, 3};
        Assert.assertEquals(1132436852, solution.combinationSum4(nums, 35));
    }
}
