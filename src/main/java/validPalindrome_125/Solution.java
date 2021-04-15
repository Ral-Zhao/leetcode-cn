package validPalindrome_125;

/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * <p>
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "race a car"
 * 输出: false
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-palindrome
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        int left = -1;
        int right = s.length();
        while (left < right) {
            do {
                left++;
            } while (left < right && !isValid(s.charAt(left)));
            do {
                right--;
            } while (left < right && !isValid(s.charAt(right)));

            if (left < right && !s.substring(left, left + 1).equalsIgnoreCase(s.substring(right, right + 1))) {
                return false;
            }
        }
        return true;
    }

    private boolean isValid(char s) {
        return (s >= '0' && s <= '9') || (s >= 'a' && s <= 'z') || (s >= 'A' && s <= 'Z');
    }
}
