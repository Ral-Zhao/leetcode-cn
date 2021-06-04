package permutations_46;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1,2,3};
        List<List<Integer>> result;
        result = solution.permute(nums);
        System.out.println(JSON.toJSONString(result));
        nums = new int[]{1};
        result = solution.permute(nums);
        System.out.println(JSON.toJSONString(result));
    }
}
