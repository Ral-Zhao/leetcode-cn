package emoveDuplicatesFromSortedArrayIi_80;

import com.alibaba.fastjson.JSON;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        System.out.println(solution.removeDuplicates(nums));
        System.out.println(JSON.toJSONString(nums));
        nums = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
        System.out.println(solution.removeDuplicates(nums));
        System.out.println(JSON.toJSONString(nums));
        nums = new int[]{1, 2, 2};
        System.out.println(solution.removeDuplicates(nums));
        System.out.println(JSON.toJSONString(nums));
        nums = new int[]{1, 1, 1, 1};
        System.out.println(solution.removeDuplicates(nums));
        System.out.println(JSON.toJSONString(nums));
    }
}
