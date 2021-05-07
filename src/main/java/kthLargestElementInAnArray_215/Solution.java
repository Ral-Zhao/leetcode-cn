package kthLargestElementInAnArray_215;

/**
 * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,2,1,5,6,4] 和 k = 2
 * 输出: 5
 * 示例 2:
 * <p>
 * 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
 * 输出: 4
 * 说明:
 * <p>
 * 你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/kth-largest-element-in-an-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int findKthLargest(int[] nums, int k) {
        for (int i = (nums.length - 2) / 2; i >= 0; i--) {
            fitDown(nums, i, nums.length);
        }
        int result = 0;
        for (int i = 0; i < k; i++) {
            result = nums[0];
            nums[0] = nums[nums.length - 1 - i];
            fitDown(nums, 0, nums.length - i - 1);
        }
        return result;
    }

    private void fitDown(int[] nums, int index, int len) {
        while (index * 2 + 1 < len) {
            int left = index * 2 + 1;
            int right = index * 2 + 2;
            int maxChild = right >= nums.length ? left : nums[left] > nums[right] ? left : right;
            if (nums[index] < nums[maxChild]) {
                int temp = nums[index];
                nums[index] = nums[maxChild];
                nums[maxChild] = temp;
            }
            index = maxChild;
        }
    }
}
