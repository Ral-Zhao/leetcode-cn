package minimumWindowSubstring_76;

import java.util.HashMap;
import java.util.Map;

/**
 * 给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。
 * <p>
 * 注意：如果 s 中存在这样的子串，我们保证它是唯一的答案。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "ADOBECODEBANC", t = "ABC"
 * 输出："BANC"
 * 示例 2：
 * <p>
 * 输入：s = "a", t = "a"
 * 输出："a"
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= s.length, t.length <= 10^5
 * s 和 t 由英文字母组成
 *  
 * <p>
 * 进阶：你能设计一个在 o(n) 时间内解决此问题的算法吗？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-window-substring
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
        }
        String result = "";
        int left = 0;
        int right = 0;
        int min = s.length();
        int match = 0;
        Map<Character, Integer> sMap = new HashMap<>();
        while (right < s.length()) {
            char rightChar = s.charAt(right);
            if (tMap.containsKey(rightChar)) {
                sMap.put(rightChar, sMap.getOrDefault(rightChar, 0) + 1);
                if (sMap.get(rightChar) <= tMap.get(rightChar)) {
                    match++;
                }
            }
            right++;
            while (match >= t.length()) {
                char leftChar = s.charAt(left);
                if (right - left <= min) {
                    result = s.substring(left, right);
                    min = right - left;
                }
                if (sMap.containsKey(leftChar)) {
                    sMap.put(leftChar, sMap.get(leftChar) - 1);
                    if (sMap.get(leftChar) < tMap.get(leftChar)) {
                        match--;
                    }
                }
                left++;
            }
        }

        return result;
    }
}
