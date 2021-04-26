package singleElementInASortedArray_540;

/**
 * 给定一个只包含整数的有序数组，每个元素都会出现两次，唯有一个数只会出现一次，找出这个数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,1,2,3,3,4,4,8,8]
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: [3,3,7,7,10,11,11]
 * 输出: 10
 * 注意: 您的方案应该在 O(log n)时间复杂度和 O(1)空间复杂度中运行。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/single-element-in-a-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid + 1 < nums.length && nums[mid] == nums[mid + 1]) {
                if (mid % 2 == 0) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else if (mid - 1 >= 0 && nums[mid] == nums[mid - 1]) {
                if (mid % 2 == 0) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                return nums[mid];
            }
        }
        return -1;
    }
}
