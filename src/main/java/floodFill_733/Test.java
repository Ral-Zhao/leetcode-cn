package floodFill_733;

import com.alibaba.fastjson.JSON;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] image = new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        image = solution.floodFill(image, 1, 1, 2);
        System.out.println(JSON.toJSONString(image));
        image = new int[][]{{0, 0, 0}, {0, 1, 1}};
        image = solution.floodFill(image, 1, 1, 1);
        System.out.println(JSON.toJSONString(image));
    }
}
