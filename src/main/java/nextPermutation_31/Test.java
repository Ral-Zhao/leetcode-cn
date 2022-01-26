package nextPermutation_31;

import utils.ArrayUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 2, 3};
        solution.nextPermutation(nums);
        ArrayUtil.printArray(nums);
        nums = new int[]{3,2,1};
        solution.nextPermutation(nums);
        ArrayUtil.printArray(nums);
        nums = new int[]{1,1,5};
        solution.nextPermutation(nums);
        ArrayUtil.printArray(nums);
        nums = new int[]{4,20,9,15,3};
        solution.nextPermutation(nums);
        ArrayUtil.printArray(nums);
    }
}
