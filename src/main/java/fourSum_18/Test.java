package fourSum_18;

import com.alibaba.fastjson.JSON;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{-5, -4, -3, -2, -1, 0, 0, 1, 2, 3, 4, 5};
        System.out.println(JSON.toJSONString(solution.fourSum(nums, 0)));
        nums = new int[]{0, 0, 0, 0};
        System.out.println(JSON.toJSONString(solution.fourSum(nums, 0)));
    }
}
