package squaresOfASortedArray_977;

/**
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 * 解释：平方后，数组变为 [16,1,0,9,100]
 * 排序后，数组变为 [0,1,9,16,100]
 * 示例 2：
 * <p>
 * 输入：nums = [-7,-3,2,3,11]
 * 输出：[4,9,9,49,121]
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums 已按 非递减顺序 排序
 *  
 * <p>
 * 进阶：
 * <p>
 * 请你设计时间复杂度为 O(n) 的算法解决本问题
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/squares-of-a-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        if (nums.length == 1) {
            result[0] = nums[0] * nums[0];
            return result;
        }
        if (nums[0] >= 0) {
            for (int i = 0; i < nums.length; i++) {
                result[i] = nums[i] * nums[i];
            }
            return result;
        }
        if (nums[nums.length-1] <=0) {
            for (int i = 0; i < nums.length; i++) {
                result[i] = nums[nums.length - 1 - i] * nums[nums.length - 1 - i];
            }
            return result;
        }
        int left = 0;
        int right = left + 1;
        while (right < nums.length) {
            if (nums[left] < 0 && nums[right] >= 0) {
                break;
            } else {
                left++;
                right = left + 1;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (left < 0) {
                result[i] = nums[right] * nums[right];
                right++;
                continue;
            }
            if (right >= nums.length) {
                result[i] = nums[left] * nums[left];
                left--;
                continue;
            }
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                result[i] = nums[left] * nums[left];
                left--;
            } else {
                result[i] = nums[right] * nums[right];
                right++;
            }
        }
        return result;
    }
}
