package degreeOfAnArray_697;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 2, 2, 3, 1};
        System.out.println(solution.findShortestSubArray(nums));
        nums = new int[]{1, 2, 2, 3, 1, 4, 2};
        System.out.println(solution.findShortestSubArray(nums));
    }
}
