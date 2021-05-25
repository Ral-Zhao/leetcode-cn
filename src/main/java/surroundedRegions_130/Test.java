package surroundedRegions_130;

import com.alibaba.fastjson.JSON;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[][] board = new char[][]{
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}};
        solution.solve(board);
        System.out.println(JSON.toJSONString(board));
    }
}
