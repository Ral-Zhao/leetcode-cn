package combinationSumIi_40;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> result;
        int[] candidates = new int[]{10, 1, 2, 7, 6, 1, 5};
        result = solution.combinationSum2(candidates, 8);
        System.out.println(JSON.toJSONString(result));
        candidates = new int[]{2, 5, 2, 1, 2};
        result = solution.combinationSum2(candidates, 5);
        System.out.println(JSON.toJSONString(result));
    }
}
