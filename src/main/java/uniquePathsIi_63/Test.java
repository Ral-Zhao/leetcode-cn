package uniquePathsIi_63;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        Assert.assertEquals(2, solution.uniquePathsWithObstacles(grid));
        grid = new int[][]{{0, 1}, {0, 0}};
        Assert.assertEquals(1, solution.uniquePathsWithObstacles(grid));
    }
}
