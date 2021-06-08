package subsetsIi_90;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> result;
        int[] nums = new int[]{1, 2, 2};
        result = solution.subsetsWithDup(nums);
        System.out.println(JSON.toJSONString(result));
        nums = new int[]{4,4,4,1,4};
        result = solution.subsetsWithDup(nums);
        System.out.println(JSON.toJSONString(result));
    }
}
