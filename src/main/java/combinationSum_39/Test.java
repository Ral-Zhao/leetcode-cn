package combinationSum_39;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> result;
        int[] candidates = new int[]{2, 3, 6, 7};
        result = solution.combinationSum(candidates, 7);
        System.out.println(JSON.toJSONString(result));
        candidates = new int[]{2, 3, 5};
        result = solution.combinationSum(candidates, 8);
        System.out.println(JSON.toJSONString(result));
    }
}
