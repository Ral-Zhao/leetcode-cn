package scoreOfParentheses_856;

import java.util.Stack;

/**
 * 给定一个平衡括号字符串 S，按下述规则计算该字符串的分数：
 * <p>
 * () 得 1 分。
 * AB 得 A + B 分，其中 A 和 B 是平衡括号字符串。
 * (A) 得 2 * A 分，其中 A 是平衡括号字符串。
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入： "()"
 * 输出： 1
 * 示例 2：
 * <p>
 * 输入： "(())"
 * 输出： 2
 * 示例 3：
 * <p>
 * 输入： "()()"
 * 输出： 2
 * 示例 4：
 * <p>
 * 输入： "(()(()))"
 * 输出： 6
 *  
 * <p>
 * 提示：
 * <p>
 * S 是平衡括号字符串，且只含有 ( 和 ) 。
 * 2 <= S.length <= 50
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/score-of-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int scoreOfParentheses(String S) {
        int length = S.length();
        int sum = 0;
        int n = 0;
        for (int i = 0; i < length; i++) {
            if (S.charAt(i) == '(') {
                if (n == 0) {
                    n = 1;
                } else {
                    n = n * 2;
                }
            } else if (S.charAt(i) == ')') {
                if (S.charAt(i - 1) == '(') {
                    sum += n;
                }
                n = n / 2;
            }
        }
        return sum;
    }


}
