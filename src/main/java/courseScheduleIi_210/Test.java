package courseScheduleIi_210;

import utils.ArrayUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr = new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        int[] result;
        result = solution.findOrder(4, arr);
        ArrayUtil.printArray(result);
        arr = new int[][]{{1, 0}};
        result = solution.findOrder(2, arr);
        ArrayUtil.printArray(result);
        arr = new int[][]{};
        result = solution.findOrder(5, arr);
        ArrayUtil.printArray(result);
        arr = new int[][]{{0, 1}};
        result = solution.findOrder(2, arr);
        ArrayUtil.printArray(result);
        arr = new int[][]{{1, 0}, {1, 2}, {0, 1}};
        result = solution.findOrder(3, arr);
        ArrayUtil.printArray(result);
    }
}
