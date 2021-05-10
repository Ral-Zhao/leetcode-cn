package longestConsecutiveSequence_128;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
 * <p>
 *  
 * <p>
 * 进阶：你可以设计并实现时间复杂度为 O(n) 的解决方案吗？
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [100,4,200,1,3,2]
 * 输出：4
 * 解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
 * 示例 2：
 * <p>
 * 输入：nums = [0,3,7,2,5,8,4,6,0,1]
 * 输出：9
 *  
 * <p>
 * 提示：
 * <p>
 * 0 <= nums.length <= 10^4
 * -10^9 <= nums[i] <= 10^9
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-consecutive-sequence
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int max = 0;
        for (int n : nums) {
            int count = 1;
            int temp = n;
            if (set.contains(temp - 1)) {
                continue;
            }
            while (set.contains(temp + 1)) {
                count++;
                temp = temp + 1;
            }
            max = Math.max(max, count);
        }
        return max;
    }


    /**
     * 用哈希表存储每个端点值对应连续区间的长度
     * 若数已在哈希表中：跳过不做处理
     * 若是新数加入：
     *   取出其左右相邻数已有的连续区间长度 left 和 right
     *   计算当前数的区间长度为：cur_length = left + right + 1
     *   根据 cur_length 更新最大长度 max_length 的值
     *   更新区间两端点的长度值
     */
    public int longestConsecutive_best(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int num : nums) {
            if (map.get(num) == null) {
                int left = map.getOrDefault(num - 1, 0);
                int right = map.getOrDefault(num + 1, 0);
                int len = left + right + 1;
                max = Math.max(max, len);
                map.put(num, len);
                map.put(num - left, len);
                map.put(num + right, len);
            }
        }
        return max;
    }
}
