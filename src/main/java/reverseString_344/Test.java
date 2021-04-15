package reverseString_344;

import com.alibaba.fastjson.JSON;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] s = new char[]{'h','e','l','l','o'};
        solution.reverseString(s);
        System.out.println(JSON.toJSONString(s));
        s = new char[]{'h','e'};
        solution.reverseString(s);
        System.out.println(JSON.toJSONString(s));
        s = new char[]{'h','e','g'};
        solution.reverseString(s);
        System.out.println(JSON.toJSONString(s));
        s = new char[]{'h','e','g','t','i','q'};
        solution.reverseString(s);
        System.out.println(JSON.toJSONString(s));
    }
}
