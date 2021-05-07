package containsDuplicateIii_220;

import java.util.*;

/**
 * 给你一个整数数组 nums 和两个整数 k 和 t 。
 * 请你判断是否存在 两个不同下标 i 和 j，使得 abs(nums[i] - nums[j]) <= t ，同时又满足 abs(i - j) <= k 。
 * <p>
 * 如果存在则返回 true，不存在返回 false。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,2,3,1], k = 3, t = 0
 * 输出：true
 * 示例 2：
 * <p>
 * 输入：nums = [1,0,1,1], k = 1, t = 2
 * 输出：true
 * 示例 3：
 * <p>
 * 输入：nums = [1,5,9,1,5,9], k = 2, t = 3
 * 输出：false
 *  
 * <p>
 * 提示：
 * <p>
 * 0 <= nums.length <= 2 * 10^4
 * -2^31 <= nums[i] <= 2^31 - 1
 * 0 <= k <= 10^4
 * 0 <= t <= 2^31 - 1
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/contains-duplicate-iii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            Pair pair = new Pair(nums[i], i);
            list.add(pair);
        }
        Collections.sort(list, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.value - o2.value;
            }
        });
        int index = 0;
        while (index < list.size()) {
            Pair base = list.get(index);
            List<Integer> temp = new ArrayList<>();
            int step = index;
            while (++step < list.size()) {
                if (Math.abs((long) base.value - (long) list.get(step).value) <= t) {
                    temp.add(list.get(step).pos);
                } else {
                    break;
                }
            }
            if (!temp.isEmpty()) {
                temp.add(base.pos);
                Collections.sort(temp);
                for (int i = 0; i < temp.size() - 1; i++) {
                    if (temp.get(i + 1) - temp.get(i) <= k) {
                        return true;
                    }
                }
            }
            index++;

        }
        return false;
    }

    class Pair {
        int value;
        int pos;

        Pair(int value, int pos) {
            this.value = value;
            this.pos = pos;
        }
    }

    public boolean containsNearbyAlmostDuplicate_best(int[] nums, int k, int t) {
        // 滑动窗口结合查找表，此时滑动窗口即为查找表本身（控制查找表的大小即可控制窗口大小）
        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            // 边添加边查找
            // 查找表中是否有大于等于 nums[i] - t 且小于等于 nums[i] + t 的值
            Long ceiling = set.ceiling((long) nums[i] - (long) t);
            if (ceiling != null && ceiling <= ((long) nums[i] + (long) t)) {
                return true;
            }
            // 添加后，控制查找表（窗口）大小，移除窗口最左边元素
            set.add((long) nums[i]);
            if (set.size() == k + 1) {
                set.remove((long) nums[i - k]);
            }
        }
        return false;
    }

    public boolean containsNearbyAlmostDuplicate_bucket(int[] nums, int k, int t) {
        if (t < 0) {
            return false;
        }

        Map<Long, Long> buckets = new HashMap<>();
        long bucketSize = t + 1; // 加一的原因是。假设 t = 2 ，那么 [0, 1, 2] 是一个桶。
        for (int i = 0; i < nums.length; i++) {
            long num = nums[i];
            long bucketId = getBucketId(num, bucketSize);
            // 判断是否重复
            if (buckets.containsKey(bucketId)) { // 当前桶存在，间隔一定小于等于 t
                return true;
            }
            if (buckets.containsKey(bucketId + 1) && Math.abs(buckets.get(bucketId + 1) - num) <= t) { // abs 的原因，无法肯定到底是前者大还是后者大
                return true;
            }
            if (buckets.containsKey(bucketId - 1) && Math.abs(buckets.get(bucketId - 1) - num) <= t) { // abs 的原因，无法肯定到底是前者大还是后者大
                return true;
            }
            // 添加到当前桶。
            buckets.put(bucketId, num);
            // 移除超过范围的
            if (buckets.size() > k) {
                buckets.remove(getBucketId(nums[i - k], bucketSize), (long) nums[i - k]);
            }
        }

        return false;
    }

    private long getBucketId(long num, long bucketSize) {
        if (num >= 0) {
            return num / bucketSize;
        }
        // (num + 1) 的原因，是因为从 -1 开始，而不是 0 。
        // 最前面 - 1 的原因是，bucketId 是从 -1 开始。
        return -1 + (num + 1) / bucketSize;
    }
}


