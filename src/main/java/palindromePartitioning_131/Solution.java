package palindromePartitioning_131;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个字符串 s，请你将 s 分割成一些子串，使每个子串都是 回文串 。返回 s 所有可能的分割方案。
 * <p>
 * 回文串 是正着读和反着读都一样的字符串。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "aab"
 * 输出：[["a","a","b"],["aa","b"]]
 * 示例 2：
 * <p>
 * 输入：s = "a"
 * 输出：[["a"]]
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= s.length <= 16
 * s 仅由小写英文字母组成
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-partitioning
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    private char[] chars;

    public List<List<String>> partition(String s) {
        this.chars = s.toCharArray();
        List<List<String>> result = new ArrayList<>();
        helper(result, new ArrayList<>(), 0);
        return result;
    }

    private void helper(List<List<String>> result, List<String> list, int index) {
        if (index == chars.length) {
            result.add(new ArrayList<>(list));
            return;
        }
        String target = "";
        for (int i = index; i < chars.length; i++) {
            target = target + chars[i];
            if (!isPalindrome(target)) {
                continue;
            }
            list.add(target);
            helper(result, list, i + 1);
            list.remove(list.size() - 1);
        }
    }

    private boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
