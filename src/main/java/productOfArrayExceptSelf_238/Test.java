package productOfArrayExceptSelf_238;

import com.alibaba.fastjson.JSON;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1,2,3,4};
        System.out.println(JSON.toJSONString(solution.productExceptSelf(nums)));
    }
}
