package minimumPathSum_64;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid = new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        Assert.assertEquals(7, solution.minPathSum(grid));
        grid = new int[][]{{1, 2, 3}, {4, 5, 6}};
        Assert.assertEquals(12, solution.minPathSum(grid));
        grid = new int[][]{{1, 2, 3}};
        Assert.assertEquals(6, solution.minPathSum(grid));

    }
}
