package makingALargeIsland_827;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grib = new int[][]{{1, 0}, {0, 1}};
        Assert.assertEquals(3, solution.largestIsland(grib));
        grib = new int[][]{{1, 1}, {1, 0}};
        Assert.assertEquals(4, solution.largestIsland(grib));
        grib = new int[][]{{1, 1}, {1, 1}};
        Assert.assertEquals(4, solution.largestIsland(grib));
        grib = new int[][]{
                {1, 1, 1, 1},
                {1, 1, 0, 0},
                {0, 0, 0, 0},
        };
        Assert.assertEquals(7, solution.largestIsland(grib));
    }
}
