package toeplitzMatrix_766;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = new int[][]{
                {1,2,3,4,2},
                {5,1,2,3,4},
                {9,5,1,2,3}
        };
        System.out.println(solution.isToeplitzMatrix(matrix));
        matrix = new int[][]{
                {9}
        };
        System.out.println(solution.isToeplitzMatrix(matrix));
    }
}
