package courseSchedule_207;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] nums = new int[][]{{1, 0}};
        Assert.assertTrue(solution.canFinish(2, nums));
        nums = new int[][]{{1, 0}, {0, 1}};
        Assert.assertTrue(!solution.canFinish(2, nums));
        nums = new int[][]{{1, 0}, {2, 1}, {3, 1}};
        Assert.assertTrue(solution.canFinish(4, nums));
        nums = new int[][]{{1, 0}, {2, 1}, {0, 2}};
        Assert.assertTrue(!solution.canFinish(3, nums));
        nums = new int[][]{{1, 4}, {2, 4}, {3, 1}, {3, 2}};
        Assert.assertTrue(solution.canFinish(5, nums));
    }
}
