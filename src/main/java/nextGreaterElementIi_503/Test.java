package nextGreaterElementIi_503;

import utils.ArrayUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 2, 6, 5, 2, 5};
        int[] result = solution.nextGreaterElements(nums);
        ArrayUtil.printArray(result);
        nums = new int[]{1, 2, 1};
        result = solution.nextGreaterElements(nums);
        ArrayUtil.printArray(result);
        nums = new int[]{100, 1, 11, 1, 120, 111, 123, 1, -1, -100};
        result = solution.nextGreaterElements(nums);
        ArrayUtil.printArray(result);
    }
}
