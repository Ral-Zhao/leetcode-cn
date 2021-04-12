package squaresOfASortedArray_977;

import com.alibaba.fastjson.JSON;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{-4, -1, 0, 3, 10};
        System.out.println(JSON.toJSONString(solution.sortedSquares(nums)));
        nums = new int[]{-7,-3,2,3,11};
        System.out.println(JSON.toJSONString(solution.sortedSquares(nums)));
        nums = new int[]{-7,1,2,3,11};
        System.out.println(JSON.toJSONString(solution.sortedSquares(nums)));
        nums = new int[]{0,1,2,3,11};
        System.out.println(JSON.toJSONString(solution.sortedSquares(nums)));
        nums = new int[]{-7,-5,-2,-1,2};
        System.out.println(JSON.toJSONString(solution.sortedSquares(nums)));
    }
}
