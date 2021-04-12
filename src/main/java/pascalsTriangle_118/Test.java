package pascalsTriangle_118;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> list = solution.generate(6);
        print(list);

    }

    private static void print(List<List<Integer>> lists) {
        for (List<Integer> list : lists) {
            for (int n : list) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
