package twoSumiiInputArrayIsSorted;

import com.alibaba.fastjson.JSON;

public class Test {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,3,5,6,8,10};
        Solution solution = new Solution();
        System.out.println(JSON.toJSONString(solution.twoSum(nums,9)));
    }
}
