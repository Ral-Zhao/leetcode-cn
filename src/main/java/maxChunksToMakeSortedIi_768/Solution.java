package maxChunksToMakeSortedIi_768;

/**
 * 这个问题和“最多能完成排序的块”相似，但给定数组中的元素可以重复，输入数组最大长度为2000，其中的元素最大为10**8。
 * <p>
 * arr是一个可能包含重复元素的整数数组，我们将这个数组分割成几个“块”，并将这些块分别进行排序。之后再连接起来，使得连接的结果和按升序排序后的原数组相同。
 * <p>
 * 我们最多能将数组分成多少块？
 * <p>
 * 示例 1:
 * <p>
 * 输入: arr = [5,4,3,2,1]
 * 输出: 1
 * 解释:
 * 将数组分成2块或者更多块，都无法得到所需的结果。
 * 例如，分成 [5, 4], [3, 2, 1] 的结果是 [4, 5, 1, 2, 3]，这不是有序的数组。
 * 示例 2:
 * <p>
 * 输入: arr = [2,1,3,4,4]
 * 输出: 4
 * 解释:
 * 我们可以把它分成两块，例如 [2, 1], [3, 4, 4]。
 * 然而，分成 [2, 1], [3], [4], [4] 可以得到最多的块数。
 * 注意:
 * <p>
 * arr的长度在[1, 2000]之间。
 * arr[i]的大小在[0, 10**8]之间。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/max-chunks-to-make-sorted-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int maxChunksToSorted(int[] arr) {
        if (arr.length < 2) {
            return 1;
        }
        int[] lmax = new int[arr.length];//记录当前位置及其左边所有元素的最大值
        int[] rmin = new int[arr.length];//记录当前位置右边所有元素的最小值
        lmax[0] = arr[0];
        rmin[arr.length - 1] = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            lmax[i] = Math.max(lmax[i - 1], arr[i]);
        }
        for (int i = arr.length - 2; i >= 0; i--) {
            rmin[i] = Math.min(rmin[i + 1], arr[i + 1]);
        }
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (lmax[i] <= rmin[i]) {//只有左边的最大值小于右边的最小值时，结果才能+1
                result++;
            }
        }
        return result;
    }
}
