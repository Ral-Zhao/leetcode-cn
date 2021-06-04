package permutationsIi_47;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> result;
        int[] nums = new int[]{1, 1, 2};
        result = solution.permuteUnique(nums);
        System.out.println(JSON.toJSONString(result));
        nums = new int[]{1, 2, 3};
        result = solution.permuteUnique(nums);
        System.out.println(JSON.toJSONString(result));
        nums = new int[]{1, 2, 2, 2};
        result = solution.permuteUnique(nums);
        System.out.println(JSON.toJSONString(result));
    }
}
