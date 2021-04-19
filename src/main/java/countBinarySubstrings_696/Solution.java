package countBinarySubstrings_696;

/**
 * 给定一个字符串 s，计算具有相同数量 0 和 1 的非空（连续）子字符串的数量，并且这些子字符串中的所有 0 和所有 1 都是连续的。
 * <p>
 * 重复出现的子串要计算它们出现的次数。
 * <p>
 *  
 * <p>
 * 示例 1 :
 * <p>
 * 输入: "00110011"
 * 输出: 6
 * 解释: 有6个子串具有相同数量的连续1和0：“0011”，“01”，“1100”，“10”，“0011” 和 “01”。
 * <p>
 * 请注意，一些重复出现的子串要计算它们出现的次数。
 * <p>
 * 另外，“00110011”不是有效的子串，因为所有的0（和1）没有组合在一起。
 * 示例 2 :
 * <p>
 * 输入: "10101"
 * 输出: 4
 * 解释: 有4个子串：“10”，“01”，“10”，“01”，它们具有相同数量的连续1和0。
 *  
 * <p>
 * 提示：
 * <p>
 * s.length 在1到50,000之间。
 * s 只包含“0”或“1”字符。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/count-binary-substrings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int countBinarySubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                count++;
                int left = i - 1;
                int right = i + 2;
                while (left >= 0 && right < s.length()) {
                    if (s.charAt(left) == s.charAt(i) && s.charAt(right) == s.charAt(i + 1)) {
                        count++;
                        left--;
                        right++;
                    } else {
                        break;
                    }
                }
            }
        }
        return count;
    }
}
