package nextGreaterElementIi_503;

import java.util.Arrays;
import java.util.Stack;

/**
 * 给定一个循环数组（最后一个元素的下一个元素是数组的第一个元素），输出每个元素的下一个更大元素。
 * 数字 x 的下一个更大的元素是按数组遍历顺序，这个数字之后的第一个比它更大的数，这意味着你应该循环地搜索它的下一个更大的数。
 * 如果不存在，则输出 -1。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,1]
 * 输出: [2,-1,2]
 * 解释: 第一个 1 的下一个更大的数是 2；
 * 数字 2 找不到下一个更大的数；
 * 第二个 1 的下一个最大的数需要循环搜索，结果也是 2。
 * 注意: 输入数组的长度不会超过 10000。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/next-greater-element-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        int endIndex = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            if (stack.isEmpty() || stack.peek() >= nums[i]) {
                stack.push(nums[i]);
                result[i] = -1;
                continue;
            }
            while (!stack.isEmpty() && stack.peek() < nums[i]) {
                int n = stack.pop();
                for (int j = i - 1; j >= 0; j--) {
                    if (nums[j] == n && result[j] == -1) {
                        result[j] = nums[i];
                        break;
                    }
                }
            }
            if (stack.isEmpty()) {
                endIndex = i;
            }
            result[i] = -1;
            stack.push(nums[i]);
        }
        for (int i = 0; i <= endIndex; i++) {
            if (stack.isEmpty()) {
                break;
            }
            if (nums[i] <= stack.peek()) {
                continue;
            }
            while (!stack.isEmpty() && stack.peek() < nums[i]) {
                int n = stack.pop();
                for (int j = nums.length - 1; j >= 0; j--) {
                    if (nums[j] == n && result[j] == -1) {
                        result[j] = nums[i];
                        break;
                    }
                }
            }

        }
        return result;
    }

    public int[] nextGreaterElements_best(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n * 2; i++) {
            int num = nums[i % n];
            while (!stack.isEmpty() && num > nums[stack.peek()]) {
                res[stack.pop()] = num;
            }
            if (i < n) stack.add(i);
        }
        return res;
    }
}
