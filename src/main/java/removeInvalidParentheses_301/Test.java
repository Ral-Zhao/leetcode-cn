package removeInvalidParentheses_301;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> result;
        result = solution.removeInvalidParentheses("()())()");
        System.out.println(JSON.toJSONString(result));
        result = solution.removeInvalidParentheses("(a)())()");
        System.out.println(JSON.toJSONString(result));
        result = solution.removeInvalidParentheses(")(");
        System.out.println(JSON.toJSONString(result));
        result = solution.removeInvalidParentheses("x(");
        System.out.println(JSON.toJSONString(result));
    }
}
