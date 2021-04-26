package checkIfWordIsValidAfterSubstitutions_1003;

import java.util.Stack;

/**
 * 给你一个字符串 s ，请你判断它是否 有效 。
 * 字符串 s 有效 需要满足：假设开始有一个空字符串 t = "" ，你可以执行 任意次 下述操作将 t 转换为 s ：
 * <p>
 * 将字符串 "abc" 插入到 t 中的任意位置。形式上，t 变为 tleft + "abc" + tright，其中 t == tleft + tright 。注意，tleft 和 tright 可能为 空 。
 * 如果字符串 s 有效，则返回 true；否则，返回 false。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "aabcbc"
 * 输出：true
 * 解释：
 * "" -> "abc" -> "aabcbc"
 * 因此，"aabcbc" 有效。
 * 示例 2：
 * <p>
 * 输入：s = "abcabcababcc"
 * 输出：true
 * 解释：
 * "" -> "abc" -> "abcabc" -> "abcabcabc" -> "abcabcababcc"
 * 因此，"abcabcababcc" 有效。
 * 示例 3：
 * <p>
 * 输入：s = "abccba"
 * 输出：false
 * 解释：执行操作无法得到 "abccba" 。
 * 示例 4：
 * <p>
 * 输入：s = "cababc"
 * 输出：false
 * 解释：执行操作无法得到 "cababc" 。
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= s.length <= 2 * 104
 * s 由字母 'a'、'b' 和 'c' 组成
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/check-if-word-is-valid-after-substitutions
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public boolean isValid(String s) {
        if (s.length() < 3) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            if (stack.isEmpty() || ch1 != 'c') {
                stack.push(ch1);
                continue;
            }
            char ch2 = stack.peek();
            if (ch2 != 'b') {
                stack.push(ch1);
                continue;
            }
            stack.pop();
            if (stack.isEmpty()) {
                return false;
            }
            char ch3 = stack.peek();
            if (ch3 == 'a') {
                stack.pop();
            } else {
                stack.push(ch2);
            }

        }
        return stack.isEmpty();
    }
}
