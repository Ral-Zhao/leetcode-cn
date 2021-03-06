package splitArrayIntoFibonacciSequence_842;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个数字字符串 S，比如 S = "123456579"，我们可以将它分成斐波那契式的序列 [123, 456, 579]。
 * <p>
 * 形式上，斐波那契式序列是一个非负整数列表 F，且满足：
 * <p>
 * 0 <= F[i] <= 2^31 - 1，（也就是说，每个整数都符合 32 位有符号整数类型）；
 * F.length >= 3；
 * 对于所有的0 <= i < F.length - 2，都有 F[i] + F[i+1] = F[i+2] 成立。
 * 另外，请注意，将字符串拆分成小块时，每个块的数字一定不要以零开头，除非这个块是数字 0 本身。
 * <p>
 * 返回从 S 拆分出来的任意一组斐波那契式的序列块，如果不能拆分则返回 []。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入："123456579"
 * 输出：[123,456,579]
 * 示例 2：
 * <p>
 * 输入: "11235813"
 * 输出: [1,1,2,3,5,8,13]
 * 示例 3：
 * <p>
 * 输入: "112358130"
 * 输出: []
 * 解释: 这项任务无法完成。
 * 示例 4：
 * <p>
 * 输入："0123"
 * 输出：[]
 * 解释：每个块的数字不能以零开头，因此 "01"，"2"，"3" 不是有效答案。
 * 示例 5：
 * <p>
 * 输入: "1101111"
 * 输出: [110, 1, 111]
 * 解释: 输出 [11,0,11,11] 也同样被接受。
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= S.length <= 200
 * 字符串 S 中只含有数字。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/split-array-into-fibonacci-sequence
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    private String num;
    private List<List<Integer>> result;

    public List<Integer> splitIntoFibonacci(String num) {
        this.num = num;
        this.result = new ArrayList<>();
        helper(new ArrayList<>(), 0);
        return result.isEmpty() ? new ArrayList<>() : result.get(0);
    }

    private void helper(List<Integer> list, int index) {
        if (index == num.length()) {
            if (list.size() < 3) {
                return;
            }
            for (int i = 2; i < list.size(); i++) {
                if ((long) list.get(i - 1) + (long) list.get(i - 2) != list.get(i)) {
                    return;
                }
            }
            result.add(new ArrayList<>(list));
            return;
        }
        int cur = 0;
        for (int i = index; i < num.length(); i++) {
            cur = cur * 10 + (num.charAt(i) - '0');
            if (list.size() >= 2 && (long) list.get(list.size() - 1) + (long) list.get(list.size() - 2) != cur) {
                continue;
            }
            list.add(cur);
            helper(list, i + 1);
            list.remove(list.size() - 1);
            if (num.charAt(index) == '0') {
                return;
            }
        }
    }
}
