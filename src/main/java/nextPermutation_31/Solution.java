package nextPermutation_31;

/**
 * 实现获取 下一个排列 的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列（即，组合出下一个更大的整数）。
 * <p>
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 * <p>
 * 必须 原地 修改，只允许使用额外常数空间。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,2,3]
 * 输出：[1,3,2]
 * 示例 2：
 * <p>
 * 输入：nums = [3,2,1]
 * 输出：[1,2,3]
 * 示例 3：
 * <p>
 * 输入：nums = [1,1,5]
 * 输出：[1,5,1]
 * 示例 4：
 * <p>
 * 输入：nums = [1]
 * 输出：[1]
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 100
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/next-permutation
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public void nextPermutation(int[] nums) {
        int peakIndex = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                peakIndex = i;
                break;
            }
        }
        if (peakIndex == -1) {
            int start = 0;
            int end = nums.length - 1;
            while (start < end) {
                swap(nums, start, end);
                start++;
                end--;
            }
            return;
        }
        int leftIndex = peakIndex - 1;
        int changeIndex = peakIndex;
        for (int i = peakIndex; i < nums.length; i++) {
            if (nums[i] > nums[leftIndex] && nums[i] < nums[changeIndex]) {
                changeIndex = i;
            }
        }
        swap(nums, leftIndex, changeIndex);
        for (int i = peakIndex + 1; i < nums.length; i++) {
            int temp = nums[i];
            int j;
            for (j = i - 1; j >= peakIndex && nums[j] > temp; j--) {
                nums[j + 1] = nums[j];
            }
            nums[j + 1] = temp;
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
