package hammingDistance_461;

/**
 * 两个整数之间的 汉明距离 指的是这两个数字对应二进制位不同的位置的数目。
 * <p>
 * 给你两个整数 x 和 y，计算并返回它们之间的汉明距离。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：x = 1, y = 4
 * 输出：2
 * 解释：
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 * ↑   ↑
 * 上面的箭头指出了对应二进制位不同的位置。
 * 示例 2：
 * <p>
 * 输入：x = 3, y = 1
 * 输出：1
 *  
 * <p>
 * 提示：
 * <p>
 * 0 <= x, y <= 2^31 - 1
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/hamming-distance
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int hammingDistance(int x, int y) {
        if (x < y) {
            int temp = x;
            x = y;
            y = temp;
        }
        int count = 0;
        while (x != 0) {
            if ((x & 1) != (y  & 1)) {
                count++;
            }
            x = x >>> 1;
            y = y >>> 1;
        }
        return count;
    }
}
