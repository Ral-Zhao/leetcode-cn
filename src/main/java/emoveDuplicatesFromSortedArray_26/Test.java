package emoveDuplicatesFromSortedArray_26;

import com.alibaba.fastjson.JSON;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 1, 2};
        System.out.println(solution.removeDuplicates(nums));
        System.out.println(JSON.toJSONString(nums));
        nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(solution.removeDuplicates(nums));
        System.out.println(JSON.toJSONString(nums));
    }
}
