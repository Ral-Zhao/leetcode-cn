package twoSum;

import com.alibaba.fastjson.JSON;

public class Test {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 5, 3, 4, 1, 6, 7};
        Solution solution = new Solution();
        System.out.println(JSON.toJSONString(solution.twoSum(nums, 4)));
    }
}
