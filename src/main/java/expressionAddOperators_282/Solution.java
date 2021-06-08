package expressionAddOperators_282;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个仅包含数字 0-9 的字符串和一个目标值，在数字之间添加 二元 运算符（不是一元）+、- 或 * ，返回所有能够得到目标值的表达式。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: num = "123", target = 6
 * 输出: ["1+2+3", "1*2*3"]
 * 示例 2:
 * <p>
 * 输入: num = "232", target = 8
 * 输出: ["2*3+2", "2+3*2"]
 * 示例 3:
 * <p>
 * 输入: num = "105", target = 5
 * 输出: ["1*0+5","10-5"]
 * 示例 4:
 * <p>
 * 输入: num = "00", target = 0
 * 输出: ["0+0", "0-0", "0*0"]
 * 示例 5:
 * <p>
 * 输入: num = "3456237490", target = 9191
 * 输出: []
 *  
 * <p>
 * 提示：
 * <p>
 * 0 <= num.length <= 10
 * num 仅含数字
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/expression-add-operators
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    private String num;
    private List<String> result;

    public List<String> addOperators(String num, int target) {
        this.num = num;
        this.result = new ArrayList<>();
        helper("", target, 0, 0);
        return result;
    }

    private void helper(String res, int target, int last, int index) {
        if (index == num.length()) {
            if (target - last == 0) {
                result.add(res);
            }
            return;
        }
        int cur = 0;
        for (int i = index; i < num.length(); i++) {
            if (cur == 0 && i > index) {
                return;
            }
            cur = cur * 10 + (num.charAt(i) - '0');
            if (cur < 0) {
                return;
            }
            if ("".equals(res)) {
                helper(cur + "", target, cur, i + 1);
            } else {
                helper(res + "+" + cur, target - last, cur, i + 1);
                helper(res + "*" + cur, target, cur * last, i + 1);
                helper(res + "-" + cur, target - last, -cur, i + 1);
            }
        }
    }
}
