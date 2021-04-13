package setMatrixZeroes_73;

import com.alibaba.fastjson.JSON;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = new int[][]{
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        solution.setZeroes(matrix);
        System.out.println(JSON.toJSONString(matrix));
    }
}
