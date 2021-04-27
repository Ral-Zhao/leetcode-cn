package dailyTemperatures_739;

import utils.ArrayUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] t = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = solution.dailyTemperatures(t);
        ArrayUtil.printArray(result);
    }
}
