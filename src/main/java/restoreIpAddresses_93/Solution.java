package restoreIpAddresses_93;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 给定一个只包含数字的字符串，用以表示一个 IP 地址，返回所有可能从 s 获得的 有效 IP 地址 。你可以按任何顺序返回答案。
 * <p>
 * 有效 IP 地址 正好由四个整数（每个整数位于 0 到 255 之间组成，且不能含有前导 0），整数之间用 '.' 分隔。
 * <p>
 * 例如："0.1.2.201" 和 "192.168.1.1" 是 有效 IP 地址，但是 "0.011.255.245"、"192.168.1.312" 和 "192.168@1.1" 是 无效 IP 地址。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "25525511135"
 * 输出：["255.255.11.135","255.255.111.35"]
 * 示例 2：
 * <p>
 * 输入：s = "0000"
 * 输出：["0.0.0.0"]
 * 示例 3：
 * <p>
 * 输入：s = "1111"
 * 输出：["1.1.1.1"]
 * 示例 4：
 * <p>
 * 输入：s = "010010"
 * 输出：["0.10.0.10","0.100.1.0"]
 * 示例 5：
 * <p>
 * 输入：s = "101023"
 * 输出：["1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3"]
 *  
 * <p>
 * 提示：
 * <p>
 * 0 <= s.length <= 3000
 * s 仅由数字组成
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/restore-ip-addresses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() == 0) {
            return result;
        }
        Stack<Integer> stack = new Stack<>();
        helper(result, stack, 0, s);
        return result;
    }

    private void helper(List<String> result, Stack<Integer> stack, int index, String s) {
        if (stack.size() == 4) {
            if (index < s.length()) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (int n : stack) {
                sb.append(n).append(".");
            }
            sb.deleteCharAt(sb.length() - 1);
            result.add(sb.toString());
            return;
        }
        if (index >= s.length()) {
            return;
        }
        int i = index;
        if (s.charAt(index) == '0') {
            stack.add(0);
            helper(result, stack, index + 1, s);
            stack.pop();
        } else {
            int num = 0;
            while (i < s.length()) {
                int cur = s.charAt(i) - '0';
                num = num * 10 + cur;
                if (num > 255) {
                    break;
                }
                stack.add(num);
                helper(result, stack, ++i, s);
                stack.pop();
            }
        }

    }
}
