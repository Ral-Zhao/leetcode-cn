package restoreIpAddresses_93;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> result;
        result = solution.restoreIpAddresses("25525511135");
        System.out.println(JSON.toJSONString(result));
        result = solution.restoreIpAddresses("0000");
        System.out.println(JSON.toJSONString(result));
        result = solution.restoreIpAddresses("1111");
        System.out.println(JSON.toJSONString(result));
        result = solution.restoreIpAddresses("010010");
        System.out.println(JSON.toJSONString(result));
        result = solution.restoreIpAddresses("101023");
        System.out.println(JSON.toJSONString(result));
    }
}
