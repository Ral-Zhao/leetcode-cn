package letterCasePermutation_784;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> result;
        result = solution.letterCasePermutation("a1b2");
        System.out.println(JSON.toJSONString(result));
        result = solution.letterCasePermutation("3z4");
        System.out.println(JSON.toJSONString(result));
        result = solution.letterCasePermutation("12345");
        System.out.println(JSON.toJSONString(result));
        result = solution.letterCasePermutation("C");
        System.out.println(JSON.toJSONString(result));
    }
}
