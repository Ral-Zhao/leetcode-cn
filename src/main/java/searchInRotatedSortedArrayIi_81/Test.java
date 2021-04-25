package searchInRotatedSortedArrayIi_81;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{2, 5, 6, 0, 0, 1, 2};
        Assert.assertTrue(solution.search(nums, 0));
        nums = new int[]{2, 5, 6, 0, 0, 1, 2};
        Assert.assertTrue(!solution.search(nums, 3));
        nums = new int[]{2, 2, 2};
        Assert.assertTrue(solution.search(nums, 2));
        nums = new int[]{2, 2, 2};
        Assert.assertTrue(!solution.search(nums, 3));
        nums = new int[]{1, 0, 1, 1, 1};
        Assert.assertTrue(solution.search(nums, 0));
        nums = new int[]{3, 1, 1};
        Assert.assertTrue(solution.search(nums, 3));
    }
}
