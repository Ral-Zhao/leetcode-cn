package nonOverlappingIntervals_435;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] intervals = new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        Assert.assertEquals(1, solution.eraseOverlapIntervals(intervals));
        intervals = new int[][]{{1, 2}, {1, 2}, {1, 2}};
        Assert.assertEquals(2, solution.eraseOverlapIntervals(intervals));
        intervals = new int[][]{{1, 2}, {2, 3}};
        Assert.assertEquals(0, solution.eraseOverlapIntervals(intervals));
        intervals = new int[][]{{-52, 31}, {-73, -26}, {82, 97}, {-65, -11}, {-62, -49}, {95, 99}, {58, 95}, {-31, 49}, {66, 98}, {-63, 2}, {30, 47}, {-40, -26}};
        Assert.assertEquals(7, solution.eraseOverlapIntervals(intervals));
    }
}
