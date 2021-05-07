package containsDuplicateIii_220;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 1};
        Assert.assertTrue(solution.containsNearbyAlmostDuplicate(nums, 3, 0));
        nums = new int[]{1, 0, 1, 1};
        Assert.assertTrue(solution.containsNearbyAlmostDuplicate(nums, 1, 2));
        nums = new int[]{1, 5, 9, 1, 5, 9};
        Assert.assertTrue(!solution.containsNearbyAlmostDuplicate(nums, 2, 3));
        nums = new int[]{1, 14, 23, 45, 56, 2, 3};
        Assert.assertTrue(solution.containsNearbyAlmostDuplicate(nums, 1, 10));
        nums = new int[]{-2147483648, 2147483647};
        Assert.assertTrue(!solution.containsNearbyAlmostDuplicate(nums, 1, 1));
        nums = new int[]{3, 6, 0, 4};
        Assert.assertTrue(solution.containsNearbyAlmostDuplicate(nums, 2, 2));
    }
}
