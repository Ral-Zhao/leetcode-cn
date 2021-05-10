package longestConsecutiveSequence_128;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{100, 4, 200, 1, 3, 2};
        Assert.assertEquals(4, solution.longestConsecutive(nums));
        nums = new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        Assert.assertEquals(9, solution.longestConsecutive(nums));
        nums = new int[]{0, -1};
        Assert.assertEquals(2, solution.longestConsecutive(nums));
    }
}
