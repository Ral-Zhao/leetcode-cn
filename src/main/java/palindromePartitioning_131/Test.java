package palindromePartitioning_131;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<String>> result;
        result = solution.partition("aab");
        System.out.println(JSON.toJSONString(result));
        result = solution.partition("a");
        System.out.println(JSON.toJSONString(result));
        result = solution.partition("efe");
        System.out.println(JSON.toJSONString(result));
    }
}
