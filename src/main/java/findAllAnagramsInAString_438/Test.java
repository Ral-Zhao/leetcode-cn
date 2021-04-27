package findAllAnagramsInAString_438;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> result = solution.findAnagrams("cbaebabacd", "abc");
        System.out.println(JSON.toJSONString(result));
        result = solution.findAnagrams("abab", "ab");
        System.out.println(JSON.toJSONString(result));
    }
}
