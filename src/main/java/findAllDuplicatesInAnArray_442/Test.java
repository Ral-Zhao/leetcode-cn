package findAllDuplicatesInAnArray_442;

import com.alibaba.fastjson.JSON;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{4,3,2,7,8,2,3,1};
        System.out.println(JSON.toJSONString(solution.findDuplicates(nums)));

    }
}
