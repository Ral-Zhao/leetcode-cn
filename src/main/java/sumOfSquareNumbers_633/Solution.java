package sumOfSquareNumbers_633;

/**
 * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c 。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：c = 5
 * 输出：true
 * 解释：1 * 1 + 2 * 2 = 5
 * 示例 2：
 * <p>
 * 输入：c = 3
 * 输出：false
 * 示例 3：
 * <p>
 * 输入：c = 4
 * 输出：true
 * 示例 4：
 * <p>
 * 输入：c = 2
 * 输出：true
 * 示例 5：
 * <p>
 * 输入：c = 1
 * 输出：true
 *  
 * <p>
 * 提示：
 * <p>
 * 0 <= c <= 231 - 1
 * <p>
 * <p>
 * 链接：https://leetcode-cn.com/problems/sum-of-square-numbers
 */
public class Solution {
    public boolean judgeSquareSum(int c) {
        int right = (int) Math.sqrt(c);
        int left = 0;
        while (left <= right) {
            int sum = left * left + right * right;
            if (sum == c) {
                return true;
            } else if (sum < c) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
}
