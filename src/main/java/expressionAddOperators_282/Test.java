package expressionAddOperators_282;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> result;
        result = solution.addOperators("123", 6);
        System.out.println(JSON.toJSONString(result));
        result = solution.addOperators("232", 8);
        System.out.println(JSON.toJSONString(result));
        result = solution.addOperators("105", 5);
        System.out.println(JSON.toJSONString(result));
        result = solution.addOperators("00", 0);
        System.out.println(JSON.toJSONString(result));
        result = solution.addOperators("2147483648", -2147483648);
        System.out.println(JSON.toJSONString(result));
    }
}
