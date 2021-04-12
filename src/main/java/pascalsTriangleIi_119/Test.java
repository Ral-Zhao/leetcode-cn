package pascalsTriangleIi_119;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> list = solution.getRow(2);
        System.out.println(JSON.toJSONString(list));

    }
}
