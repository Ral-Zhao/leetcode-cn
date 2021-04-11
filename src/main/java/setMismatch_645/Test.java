package setMismatch_645;

import com.alibaba.fastjson.JSON;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 3, 5, 6};
        System.out.println(JSON.toJSONString(solution.findErrorNums(nums)));
        nums = new int[]{1, 2, 2, 4};
        System.out.println(JSON.toJSONString(solution.findErrorNums(nums)));
        nums = new int[]{3, 2, 2};
        System.out.println(JSON.toJSONString(solution.findErrorNums(nums)));
        nums = new int[]{1, 2, 2};
        System.out.println(JSON.toJSONString(solution.findErrorNums(nums)));
        nums = new int[]{1, 1};
        System.out.println(JSON.toJSONString(solution.findErrorNums(nums)));
    }
}
