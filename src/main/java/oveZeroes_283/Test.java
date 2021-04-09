package oveZeroes_283;

import com.alibaba.fastjson.JSON;

/**
 * Created by zhaozhezijian on 2021/4/9.
 */
public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{0,0,1,0,2,4,6,0,2,0};
        solution.moveZeroes(nums);
        System.out.println(JSON.toJSONString(nums));
        nums = new int[]{0,0};
        solution.moveZeroes(nums);
        System.out.println(JSON.toJSONString(nums));
    }
}
