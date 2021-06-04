package combinations_77;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> result;
        result = solution.combine(4, 2);
        System.out.println(JSON.toJSONString(result));
        result = solution.combine(4, 3);
        System.out.println(JSON.toJSONString(result));
        result = solution.combine(5, 3);
        System.out.println(JSON.toJSONString(result));
    }
}
