package nextGreaterElementI_496;

import com.alibaba.fastjson.JSON;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = new int[]{4, 1, 2};
        int[] nums2 = new int[]{1, 3, 4, 2};
        int[] result = solution.nextGreaterElement(nums1, nums2);
        System.out.println(JSON.toJSONString(result));
        nums1 = new int[]{2,4};
        nums2 = new int[]{1,2,3,4};
        result = solution.nextGreaterElement(nums1, nums2);
        System.out.println(JSON.toJSONString(result));
    }
}
