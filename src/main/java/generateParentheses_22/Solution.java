package generateParentheses_22;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 3
 * 输出：["((()))","(()())","(())()","()(())","()()()"]
 * 示例 2：
 * <p>
 * 输入：n = 1
 * 输出：["()"]
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= n <= 8
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/generate-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        helper(result, n, n, "");
        return result;
    }

    private void helper(List<String> result, int num1, int num2, String target) {
        if (num1 == 0 && num2 == 0) {
            result.add(target);
            return;
        }
        if (num1 > 0 && num1 <= num2) {
            helper(result, num1 - 1, num2, target + "(");
        }
        if (target.length() != 0 && num2 > 0) {
            helper(result, num1, num2 - 1, target + ")");
        }
    }
}
