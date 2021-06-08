package combinationSumIii_216;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> result;
        result = solution.combinationSum3(3, 7);
        System.out.println(JSON.toJSONString(result));
        result = solution.combinationSum3(3, 9);
        System.out.println(JSON.toJSONString(result));
    }
}
