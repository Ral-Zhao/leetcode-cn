package groupAnagrams_49;

import com.alibaba.fastjson.JSON;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(JSON.toJSONString(solution.groupAnagrams(strs)));
    }
}
