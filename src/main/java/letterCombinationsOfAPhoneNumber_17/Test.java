package letterCombinationsOfAPhoneNumber_17;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> result;
        result = solution.letterCombinations("23");
        System.out.println(JSON.toJSONString(result));
        result = solution.letterCombinations("2");
        System.out.println(JSON.toJSONString(result));
    }
}
