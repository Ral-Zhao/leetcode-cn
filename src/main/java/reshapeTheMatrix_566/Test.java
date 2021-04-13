package reshapeTheMatrix_566;

import com.alibaba.fastjson.JSON;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = new int[][]{
                {1,2,3},
                {9,5,1}
        };
        System.out.println(JSON.toJSONString(solution.matrixReshape(matrix,3,2)));
    }
}
