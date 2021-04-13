package spiralMatrix_54;

import com.alibaba.fastjson.JSON;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        System.out.println(JSON.toJSONString(solution.spiralOrder(matrix)));
        matrix = new int[][]{
                {1,2,3},
                {5,6,7},
                {5,6,7},
                {9,10,11}
        };
        System.out.println(JSON.toJSONString(solution.spiralOrder(matrix)));
        matrix = new int[][]{
                {9,10,11}
        };
        System.out.println(JSON.toJSONString(solution.spiralOrder(matrix)));
        matrix = new int[][]{
                {1},
                {5},
                {5},
                {9}
        };
        System.out.println(JSON.toJSONString(solution.spiralOrder(matrix)));
    }
}
