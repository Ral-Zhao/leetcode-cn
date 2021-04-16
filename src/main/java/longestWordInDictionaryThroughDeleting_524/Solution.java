package longestWordInDictionaryThroughDeleting_524;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个字符串和一个字符串字典，找到字典里面最长的字符串，该字符串可以通过删除给定字符串的某些字符来得到。如果答案不止一个，返回长度最长且字典顺序最小的字符串。如果答案不存在，则返回空字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * s = "abpcplea", d = ["ale","apple","monkey","plea"]
 * <p>
 * 输出:
 * "apple"
 * 示例 2:
 * <p>
 * 输入:
 * s = "abpcplea", d = ["a","b","c"]
 * <p>
 * 输出:
 * "a"
 * 说明:
 * <p>
 * 所有输入的字符串只包含小写字母。
 * 字典的大小不会超过 1000。
 * 所有输入的字符串长度不会超过 1000。
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-word-in-dictionary-through-deleting
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        int maxLen = 0;
        List<String> result = new ArrayList<>();
        for (String word : dictionary) {
            int i = 0;
            int j = 0;
            int len = 0;
            while (i < s.length() && j < word.length()) {
                if (s.charAt(i) == word.charAt(j)) {
                    len++;
                    i++;
                    j++;
                } else {
                    i++;
                }
            }
            if (j == word.length() && len >= maxLen) {
                maxLen = len;
                result.add(word);
            }

        }
        if (result.isEmpty()) {
            return "";
        }
        result.sort((a, b) -> {
            if (a.length() != b.length()) {
                return b.length() - a.length();
            }
            return a.compareTo(b);
        });
        return result.get(0);
    }
}
