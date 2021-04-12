package rotateArray_189;

import com.alibaba.fastjson.JSON;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1,5,3,8,-4,0,6};
        solution.rotate(nums,7);
        System.out.println(JSON.toJSONString(nums));
    }
}
