package letterCasePermutation_784;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个字符串S，通过将字符串S中的每个字母转变大小写，我们可以获得一个新的字符串。返回所有可能得到的字符串集合。
 * <p>
 *  
 * <p>
 * 示例：
 * 输入：S = "a1b2"
 * 输出：["a1b2", "a1B2", "A1b2", "A1B2"]
 * <p>
 * 输入：S = "3z4"
 * 输出：["3z4", "3Z4"]
 * <p>
 * 输入：S = "12345"
 * 输出：["12345"]
 *  
 * <p>
 * 提示：
 * <p>
 * S 的长度不超过12。
 * S 仅由数字和字母组成。
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/letter-case-permutation
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        helper(result, s, "", 0);
        return result;
    }

    private void helper(List<String> result, String s, String target, int index) {
        if (s.length() == index) {
            result.add(target);
            return;
        }
        char ch = s.charAt(index);
        helper(result, s, target + ch, index + 1);
        if (ch >= 'a' && ch <= 'z') {
            char newCh = (char) ((int) ch - 32);
            helper(result, s, target + newCh, index + 1);
        } else if (ch >= 'A' && ch <= 'Z') {
            char newCh = (char) ((int) ch + 32);
            helper(result, s, target + newCh, index + 1);
        }
    }
}
