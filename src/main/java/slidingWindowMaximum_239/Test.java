package slidingWindowMaximum_239;

import utils.ArrayUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int[] result = solution.maxSlidingWindow(nums, 3);
        ArrayUtil.printArray(result);
        nums = new int[]{1,-1};
        result = solution.maxSlidingWindow(nums, 1);
        ArrayUtil.printArray(result);
        nums = new int[]{9,11};
        result = solution.maxSlidingWindow(nums, 2);
        ArrayUtil.printArray(result);
    }
}
