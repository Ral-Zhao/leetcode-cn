package topKFrequentElements_347;

import utils.ArrayUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int[] result = solution.topKFrequent(nums, 2);
        ArrayUtil.printArray(result);
        nums = new int[]{1, 1, 2, 2, 3, 3, 3, 4, 4, 4};
        result = solution.topKFrequent(nums, 2);
        ArrayUtil.printArray(result);
    }
}
