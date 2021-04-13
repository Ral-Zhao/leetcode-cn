package searchA2dMatrix_74;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = new int[][]{
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        System.out.println(solution.searchMatrix(matrix,60));
    }
}
