package emoveElement_27;

import com.alibaba.fastjson.JSON;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{3,2,2,3};
        System.out.println(solution.removeElement(nums,3));
        System.out.println(JSON.toJSONString(nums));
        nums = new int[]{0,1,2,2,3,0,4,2};
        System.out.println(solution.removeElement(nums,2));
        System.out.println(JSON.toJSONString(nums));
    }
}
