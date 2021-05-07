package sortColors_75;

import utils.ArrayUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        solution.sortColors(nums);
        ArrayUtil.printArray(nums);
        nums = new int[]{2, 0, 1};
        solution.sortColors(nums);
        ArrayUtil.printArray(nums);
    }
}
