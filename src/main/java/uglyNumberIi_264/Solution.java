package uglyNumberIi_264;

/**
 * 给你一个整数 n ，请你找出并返回第 n 个 丑数 。
 * <p>
 * 丑数 就是只包含质因数 2、3 和/或 5 的正整数。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 10
 * 输出：12
 * 解释：[1, 2, 3, 4, 5, 6, 8, 9, 10, 12] 是由前 10 个丑数组成的序列。
 * 示例 2：
 * <p>
 * 输入：n = 1
 * 输出：1
 * 解释：1 通常被视为丑数。
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= n <= 1690
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ugly-number-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int n2 = 0;
        int n3 = 0;
        int n5 = 0;
        for (int i = 1; i < n; i++) {
            dp[i] = Math.min(dp[n2] * 2, Math.min(dp[n3] * 3, dp[n5] * 5));
            if (dp[i] == dp[n2] * 2) {
                n2++;
            }
            if (dp[i] == dp[n3] * 3) {
                n3++;
            }
            if (dp[i] == dp[n5] * 5) {
                n5++;
            }
        }
        return dp[n - 1];
    }
}
