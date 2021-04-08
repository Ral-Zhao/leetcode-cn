package threeSum_15;

import com.alibaba.fastjson.JSON;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{0,0,0};
        System.out.println(JSON.toJSONString(solution.threeSum(nums)));
        nums = new int[]{-1, -1, -4, -2, 0, 3,3, 2, 1, 8, 4};
        System.out.println(JSON.toJSONString(solution.threeSum(nums)));
    }
}
