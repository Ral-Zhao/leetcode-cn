package findFirstAndLastPositionOfElementInSortedArray_34;

import com.alibaba.fastjson.JSON;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        System.out.println(JSON.toJSONString(solution.searchRange(nums, 10)));
        nums = new int[]{5, 7, 7, 8, 8, 10};
        System.out.println(JSON.toJSONString(solution.searchRange(nums, 7)));
        nums = new int[]{5, 7, 7, 8, 8, 10};
        System.out.println(JSON.toJSONString(solution.searchRange(nums, 4)));
    }
}
