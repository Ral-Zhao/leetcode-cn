package validPalindromeIi_680;

/**
 * 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "aba"
 * 输出: True
 * 示例 2:
 * <p>
 * 输入: "abca"
 * 输出: True
 * 解释: 你可以删除c字符。
 * 注意:
 * <p>
 * 字符串只包含从 a-z 的小写字母。字符串的最大长度是50000。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-palindrome-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public boolean validPalindrome(String s) {
        return isValid(s, 0, s.length() - 1, true);
    }

    private boolean isValid(String s, int start, int end, boolean allowDelete) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                if (!allowDelete) {
                    return false;
                }
                return isValid(s, start + 1, end, false) || isValid(s, start, end-1, false);
            } else {
                start++;
                end--;
            }
        }
        return true;
    }
}
