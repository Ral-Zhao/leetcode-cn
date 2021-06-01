package generateParentheses_22;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> result;
        result = solution.generateParenthesis(3);
        System.out.println(JSON.toJSONString(result));
        result = solution.generateParenthesis(1);
        System.out.println(JSON.toJSONString(result));
        result = solution.generateParenthesis(2);
        System.out.println(JSON.toJSONString(result));
        result = solution.generateParenthesis(4);
        System.out.println(JSON.toJSONString(result));
    }
}
