package nQueens_51;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<String>> result;
        result = solution.solveNQueens(4);
        System.out.println(JSON.toJSONString(result));
        result = solution.solveNQueens(1);
        System.out.println(JSON.toJSONString(result));
    }
}
